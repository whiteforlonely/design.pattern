package com.ake.designpattern.nullobject.demo;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "not available in customer database!";
	}

}
