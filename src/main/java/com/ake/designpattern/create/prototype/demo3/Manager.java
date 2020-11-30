package com.ake.designpattern.create.prototype.demo3;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	private Map<String, Product> showCases = new HashMap<String, Product>();
	
	public void register(String key, Product product){
		showCases.put(key, product);
	}
	
	// 这个也算是一个比较典型的例子。
	public Product create(String name){
		Product product = showCases.get(name);
		return product.createClone();
	}
}
