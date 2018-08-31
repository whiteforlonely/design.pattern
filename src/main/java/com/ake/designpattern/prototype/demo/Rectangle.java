package com.ake.designpattern.prototype.demo;

import com.ake.designpattern.common.ShapeType;

public class Rectangle extends Shape{

	public Rectangle(){
		type = ShapeType.RECTANGLE;
	}
	
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
