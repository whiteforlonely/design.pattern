package com.ake.designpattern.strategy.demo2;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class CalPriceFactory {

	private static final String CAL_PRICE_PACKAGE = "com.ake.designpattern.strategy.demo2";
	private ClassLoader classLoader = getClass().getClassLoader();
	private List<Class<? extends CalPrice>> calPriceList;
	private static CalPriceFactory calPriceFactory;
	
	private CalPriceFactory(){
		init();
	}
	
	public CalPrice createCalPrice(Player player){
		for (Class<? extends CalPrice> clazz : calPriceList) {
			PriceRegion validRegion = handleAnnotation(clazz);
			if (player.getTotalAmount() > validRegion.min() && player.getTotalAmount() < validRegion.max()) {
				try {
					return clazz.newInstance();
				} catch (Exception e) {
				}
			}
		}
		
		throw new RuntimeException("获取策略失败！");
	}
	
	//穿入一个策略类，返回注解
	private PriceRegion handleAnnotation(Class<? extends CalPrice> clazz){
		Annotation[] annotations = clazz.getDeclaredAnnotations();
		if (annotations == null || annotations.length == 0) {
			return null;
		}
		
		for(int i = 0; i < annotations.length ; i ++){
			if (annotations[i] instanceof PriceRegion) {
				return (PriceRegion) annotations[i];
			}
		}
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private void init(){
		calPriceList = new ArrayList<Class<? extends CalPrice>>();
        File[] resources = getResources();//获取到包下所有的class文件
        Class<CalPrice> calPriceClazz = null;
        try {
            calPriceClazz = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());//使用相同的加载器加载策略接口
        } catch (ClassNotFoundException e1) {
            throw new RuntimeException("未找到策略接口");
        }
        for (int i = 0; i < resources.length; i++) {
            try {
                //载入包下的类
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + resources[i].getName().replace(".class", ""));
                //判断是否是CalPrice的实现类并且不是CalPrice它本身，满足的话加入到策略列表
                if (CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz) {
                    calPriceList.add((Class<? extends CalPrice>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
	}
	
	private File[] getResources(){
		try {
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(new FileFilter() {
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class")) {//我们只扫描class文件
                        return true;
                    }
                    return false;
                }
            });
        } catch (URISyntaxException e) {
            throw new RuntimeException("未找到策略资源");
        }
	}
	
	public static CalPriceFactory getInstance(){
		if (calPriceFactory == null) {
			calPriceFactory = new CalPriceFactory();
		}
		
		return calPriceFactory;
	}
}
