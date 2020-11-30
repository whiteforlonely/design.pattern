package com.ake.designpattern.create.prototype.demo;

import com.ake.designpattern.common.ShapeType;

public class Circle extends Shape{

	public Circle(){
		type = ShapeType.CIRCLE;
	}
	
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
