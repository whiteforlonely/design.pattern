package com.ake.designpattern.bridge.demo4;

public abstract class Painter {

	protected Shape shape;
	
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	abstract void paintShape();
}
