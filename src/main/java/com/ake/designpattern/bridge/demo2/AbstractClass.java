package com.ake.designpattern.bridge.demo2;

public abstract class AbstractClass {

	protected Implementer implementer;
	
	public void setImplement(Implementer implementer){
		this.implementer = implementer;
	}
	
	abstract void operate();
}
