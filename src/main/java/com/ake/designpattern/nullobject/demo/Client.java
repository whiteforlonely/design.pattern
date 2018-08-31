package com.ake.designpattern.nullobject.demo;

public class Client {

	public static void main(String[] args) {
	
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Job");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Joe");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Julie");
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}
