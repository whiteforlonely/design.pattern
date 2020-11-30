package com.ake.designpattern.decorator.demo1;

public abstract class Decorator implements Comp{

	protected Comp comp;
	
	public Decorator(Comp com) {
		this.comp =com;
	}
}
