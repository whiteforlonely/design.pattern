package com.ake.designpattern.create.prototype.demo3;

public interface Product extends Cloneable{

	void user(String s);
	
	Product createClone();
}
