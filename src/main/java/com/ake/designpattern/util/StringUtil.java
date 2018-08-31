package com.ake.designpattern.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串操作类
 * 
 * @author xzq
 * 
 */
public class StringUtil {
	//正则表达式使用的中文字符
	static String exp="^[\u4E00-\u9FA5|\\！|\\，|\\.|\\。|\\（|\\）|\\《|\\》|\\“|\\”|\\？|\\：|\\；|\\【|\\】]$";
	/**
	 *  将形式为“discountId=5|discountName=[橙菓orange]草本凉茶|type=BUY”字符串解析为
	 *  Map
	 * @return Map
	 */
	public static Map<String,String> makeMap(String str, char separator) {
		Map<String, String> map = new HashMap<String, String>(); 
		String[] strs = null; 
		if(!"".equals(str)) {
			strs = str.split("\\"+separator); 
		}
		
		if(strs != null) {
			for(String s : strs) {
				if(!"".equals(s)) {
					String[] 	ss = s.split("="); 
					if(ss != null && ss.length ==2) {
						map.put(ss[0], ss[1]); 
					}
				}
			}
		}
		return map; 
	}

	/**
	 * 数组拼装成 xx,yy,zz
	 * 
	 * @param array
	 *            数组
	 * @param separator
	 *            分隔符
	 * @return 字符串
	 */
	public static <T>String joinForStr(T [] array, char separator) {
		StringBuffer str = new StringBuffer();
		String newStr = "";
		if (array != null && array.length > 0) {
			for (T arr : array) {
				str.append(arr).append(separator);
			}
			newStr = str.substring(0, str.length() - 1);
		}
		return newStr;
	}
	

	/**
	 * 数组拼装成 xx,yy,zz
	 * 
	 * @param array
	 *            数组
	 * @param separator
	 *            分隔符
	 * @return 字符串
	 */
	public static <T>String joinForStr(List<T> array, char separator) {
		StringBuffer str = new StringBuffer();
		String newStr = "";
		if (array != null && array.size() > 0) {
			for (T arr : array) {
				str.append(arr).append(separator);
			}
			newStr = str.substring(0, str.length() - 1);
		}
		return newStr;
	}
	/**
	 * 数组拼装成 xx,yy,zz
	 * 
	 * @param array
	 *            数组
	 * @param separator
	 *            分隔符
	 * @return 字符串
	 */
	public static <T>String joinForStrBySeparatorStr(List<T> array, String separator) {
		StringBuffer str = new StringBuffer();
		String newStr = "";
		if (array != null && array.size() > 0) {
			for (int i = 0 ; i < array.size() ; i++) {
				if(i>0) {
					str.append(separator).append(array.get(i));
				} else {
					str.append(array.get(i));
				}
			}
			newStr = str.toString();
		}
		return newStr;
	}

	/**
	 * 将xx,yy,zz字符串拆分成集合
	 * @param strValue 字符串
	 * @return 集合
	 */
	public static List<Integer> reverseJoinForStr(String strValue) {

		if (strValue == null || strValue.equals("")) {
			return null;
		}
		String[] feedStrs = strValue.split(",");
		List<Integer> result = null;
		if (feedStrs == null || feedStrs.length == 0) {
			return null;
		} else {
			result = new ArrayList<Integer>();
			// 去虫和最近排序
			for (int i = 0;i < feedStrs.length ; i++) {
				String feedIdStr = feedStrs[i];
				if (feedIdStr == null || feedIdStr.trim().equals("")) {
					continue;
				}
				feedIdStr = feedIdStr.trim();
				Pattern p = Pattern.compile("^[+]?[\\d]+(([\\.]{1}[\\d]+)|([\\d]*))$");
				Matcher m = p.matcher(feedIdStr);
				if(!m.find()){
					continue;
				}
				try {
					Integer feedId = Integer.parseInt(feedIdStr);
					if (!result.contains(feedId)) {
						result.add(feedId);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	/**
	 * 将xx,yy,zz字符串拆分成集合
	 * @param strValue 字符串
	 * @return 集合
	 */
	public static List<Long> reverseJoinStrToLongList(String strValue) {
		
		if (strValue == null || strValue.equals("")) {
			return null;
		}
		String[] feedStrs = strValue.split(",");
		List<Long> result = null;
		if (feedStrs == null || feedStrs.length == 0) {
			return null;
		} else {
			result = new ArrayList<Long>();
			// 去虫和最近排序
			for (int i = 0;i < feedStrs.length ; i++) {
				String feedIdStr = feedStrs[i];
				if (feedIdStr == null || feedIdStr.trim().equals("")) {
					continue;
				}
				feedIdStr = feedIdStr.trim();
				Pattern p = Pattern.compile("^[+]?[\\d]+(([\\.]{1}[\\d]+)|([\\d]*))$");
				Matcher m = p.matcher(feedIdStr);
				if(!m.find()){
					continue;
				}
				try {
					long feedId = Long.parseLong(feedIdStr);
					if (!result.contains(feedId)) {
						result.add(feedId);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	/**
	 * 将xx,yy,zz字符串拆分成集合
	 * @param strValue 字符串
	 * @return 集合
	 */
	public static List<String> reverseJoinForStr(String strValue, String separator) {
		
		if (strValue == null || strValue.equals("")) {
			return null;
		}
		String[] feedStrs = strValue.split(separator);
		List<String> result = null;
		if (feedStrs == null || feedStrs.length == 0) {
			return null;
		} else {
			result = new ArrayList<String>();
			// 去虫和最近排序
			for (int i = 0;i < feedStrs.length ; i++) {
				String feedIdStr = feedStrs[i];
				if (feedIdStr == null || feedIdStr.trim().equals("")) {
					continue;
				}
				
				if (!result.contains(feedIdStr)) {
					result.add(feedIdStr);
				}
				
			}
		}
		return result;
	}
	
	/**
	 * 获得最大字符串
	 * @param value 字符串
	 * @param maxLength 最大长度
	 * @return 字符串
	 */
	public static String subStringByMaxLength(String value, int maxLength) {
		String strValue = value; 
    	if(strValue != null && !strValue.equals("")) {
    		if(strValue.length() >maxLength) {
    			strValue = strValue.substring(0, maxLength-1)+"…"; 
    		} 
    	}
    	return strValue; 
	}
	
	public static String subString(String value, int maxLength) {
		String strValue = value; 
		if(strValue != null && !strValue.equals("")) {
			if(strValue.length() >maxLength) {
				strValue = strValue.substring(0, maxLength-1)+"…"; 
			} 
		}
		return strValue; 
	}
	
	/**
	 * 处理换行和空格 
	 * @param content 字符串
	 * @return 字符串 	&lt;
	 */
	public static String dealLineString(String content) {
		if(content != null && !content.equals("")) {
			// 处理换行
			content = content.replaceAll("\r", "&nbsp;");
			content = content.replaceAll("\n", "<br/>");
		 }
		return content;
	}
	
	public static String stringEncode(String content) {
		if(content != null && !content.equals("")) {
			content = content.replaceAll("&amp;", "&");
			content = content.replaceAll("&lt;", "<");
			content = content.replaceAll("&gt;", ">");
			content = content.replaceAll("&#039;", "'");
			content = content.replaceAll("&#033;", "!");
			content = content.replaceAll("&", "&amp;");
			content = content.replaceAll("<", "&lt;");
			content = content.replaceAll(">", "&gt;");
			content = content.replaceAll("'", "&#039;");
			content = content.replaceAll("\"", "&quot;");
			content = content.replaceAll("\r", "&nbsp; ");
			content = content.replaceAll("&lt;br/&gt;", "<br/>");
			content = content.replaceAll("\n", "<br/>");
		}
		return content;
	}
	public static String stringEncodeInput(String content) {
		if(content != null && !content.equals("")) {
			content = content.replaceAll("&amp;", "&");
			content = content.replaceAll("&#039;", "'");
			content = content.replaceAll("&#033;", "!");
			content = content.replaceAll("&", "&amp;");
			content = content.replaceAll("<", "&lt;");
			content = content.replaceAll(">", "&gt;");
			content = content.replaceAll("'", "&#039;");
			content = content.replaceAll("\"", "&quot;");
			content = content.replaceAll("\r", " &nbsp; ");
			content = content.replaceAll("&lt;br/&gt;", "\n");
		}
		return content;
	}
	
	/**
	 * 小组内容
	 * @param content
	 * @return
	 */
	public static String stringEncode4Group(String content){
		if(content != null && !content.equals("")) {
			content = content.replaceAll("&amp;", "&");
			content = content.replaceAll("&lt;", "<");
			content = content.replaceAll("&gt;", ">");
			content = content.replaceAll("&#039;", "'");
			content = content.replaceAll("&#033;", "!");
			content = content.replaceAll("&", "&amp;");
			content = content.replaceAll("<", "&lt;");
			content = content.replaceAll(">", "&gt;");
			content = content.replaceAll("'", "&#039;");
			content = content.replaceAll("\"", "&quot;");
			content = content.replaceAll("\r", "&nbsp; ");
			content = content.replaceAll("&lt;br/&gt;", "<br/>");
			content = content.replaceAll("\n", "<br/>");
		}
		return content;
	}
	
	/**
	 * 小组内容
	 * @param content
	 * @return
	 */
	public static String stringEncodeInput4Group(String content) {
		if(content != null && !content.equals("")) {
			content = content.replaceAll("&amp;", "&");
			content = content.replaceAll("&#039;", "'");
			content = content.replaceAll("&#033;", "!");
			content = content.replaceAll("&", "&amp;");
			content = content.replaceAll("<", "&lt;");
			content = content.replaceAll(">", "&gt;");
			content = content.replaceAll("'", "&#039;");
			content = content.replaceAll("\"", "&quot;");
			content = content.replaceAll("\r", " &nbsp; ");
			content = content.replaceAll("&lt;br/&gt;", "\n");
		}
		return content;
	}
	
	
	/** 
	 * @Title: listToString 
	 * @Description: TODO(将list转化为字符串)
	 * @param stringList
	 * @return: 
	 */
	public static String listToString(List<?> stringList){  
        if (stringList==null) {  
            return null;  
        }  
        StringBuilder result=new StringBuilder();  
        boolean flag=false;  
        for (Object string : stringList) {  
            if (flag) {  
                result.append(",");  
            }else {  
                flag=true;  
            }  
            result.append(string);  
        }  
        return result.toString();  
    }  
	
	public static List<String> filterTags(List<String> tagStrList) {
		List<String> newTagSttList = new ArrayList<String>(); 
    	// 拆分标签，去虫
    	for(String tag : tagStrList) {
    		if(tag.indexOf("/") != -1 || tag.indexOf("\\") != -1) {
    			List<String> tags = StringUtil.reverseJoinForStr(tag, "/"); 
    			if(tags == null ) {
    				tags = new ArrayList<String>(); 
    			}
    			if(tags != null) {
    				if(tags != null && tags.size() > 0 ) {
    					for(String t : tags) {
    						if(!newTagSttList.contains(t)) {
    							newTagSttList.add(t); 
    						}
    					}
    				}
    			}
    		} else {
    			if(!newTagSttList.contains(tag)) {
    				newTagSttList.add(tag); 
    		    }
    		}
    		
    	}
    	return newTagSttList; 
	}
	/**
	 * 将字符串列表转换为以指定分隔符分隔的字符串，并且每个字符串加上引号
	 * （主要方便SQL语句中要用到 where in(?) ,?是字符串列表时的情况）
	 * @param stringList	字符串列表
	 * @param separator		分隔符
	 * @return
	 */
	
	public static String strListToString(List<String> stringList , String separator){
		StringBuffer string = new StringBuffer ();
		
		for(int i =0 ; i < stringList.size();i++){
			string.append('"' + stringList.get(i)  + '"');
			if (i != (stringList.size() - 1  ) ){
				string.append(separator);
			}
		}
		return string.toString();
	}
	
	
	/**
	 * 
	* @Title: findContent
	* @Description: 去除html标记以及所有换行和空格
	 */
	public static String removeContentHtml(String html){ 
		 String rs = "";
		if(!isEmpty(html)) {
			 // 配置html标记。  
	        Pattern p = Pattern.compile("<(\\S*?)[^>]*>.*?| <.*? />");  
	        Matcher m = p.matcher(html);  
	        rs = new String(html);  
	        // 找出所有html标记。  
	        while (m.find()) {  
	            // 删除html标记。  
	            rs = rs.replace(m.group(), "");  
	        }  
	        
	        if(rs!=null) {
	        	String regEx3="img\\{(.*)\\}.img"; //表示一个或多个@  
		        Pattern pat2=Pattern.compile(regEx3);  
		        Matcher mat2=pat2.matcher(rs);  
		        rs= mat2.replaceAll(""); 
	        }
	        
	        if(rs != null) {
	        	String regEx="body\\{(.*)\\}"; //表示一个或多个@  
		        Pattern pat=Pattern.compile(regEx);  
		        Matcher mat=pat.matcher(rs);  
		        rs= mat.replaceAll(""); 
	        }
	        
		}
        return rs;
    }  
	
	/**
	 * 9位产生100万id重复率450，产生1000万id重复数45000
	 * 
	 * 建议：
	 * 10万级8位，100万级9位，1000万级10位
	 * @author yang
	 * @date   2014年4月9日
	 * @param minLen
	 * @return
	 */
	public static String getKankanId(int minLen){
		if(minLen>0){
			long timeStamp=System.currentTimeMillis();
			Random radom = new Random();
			long randomNumber = radom.nextLong();
			long  threadId=Thread.currentThread().getId();
			
			long mixNumber =Math.abs(randomNumber)+ timeStamp + threadId;
			String mixNumberStr=String.valueOf(mixNumber);
			
			String resultStr="";
			for(int i=mixNumberStr.length()-1;i>0;i--){
				char s = mixNumberStr.charAt(i);
				//第一位不能为零
				if(resultStr.length()==0 && s=='0'){
					continue;
				}
				resultStr=resultStr+s;
				if(resultStr!=null && resultStr.length() >=minLen){
					break;
				}
			}
			return resultStr;
		}
		return null;
	}
	
	
	public static boolean isFloat(String str){
		Pattern pattern = Pattern.compile("-?[0-9]+.?[0-9]+"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true;
	}
	

	public static boolean isNumeric(String str){
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}
	
	public static boolean isEmail(String email) {
		String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(email);

		return m.matches();
	}
	
    public static boolean isDigital(String word) {
        Pattern pattern = Pattern.compile("[0-9\\s ]+");
        return pattern.matcher(word).matches();
    }
    
    public static boolean isEmpty(String str){
    	return str == null || str.trim().equals("");
    }
	
    /**
     *@工具方法-中文字符和标点检测
     * */
	public static boolean isContainChinese(String str){
		Pattern p = Pattern.compile(exp);
	    for (int i = 0; i < str.length(); i++) {// 遍历字符串每一个字符  
	       char c = str.charAt(i);  
	       Matcher matcher=p.matcher(c + "");  
	       if(matcher.matches()) {  
	    	   return true;
	       }  
	    }
	    return false;
	} 
}
