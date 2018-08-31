package com.ake.designpattern.nullobject.demo;

public class CustomerFactory {

	public static final String[] names = {"Rob", "Job", "Julie"};
	
	public static AbstractCustomer getCustomer(String name){
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		
		return new NullCustomer();
	}
}
