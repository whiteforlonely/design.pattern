package com.ake.designpattern.nullobject.demo;

public class RealCustomer extends AbstractCustomer{

	
	public RealCustomer(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

}
