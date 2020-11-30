package com.ake.designpattern.create.prototype.demo;

import com.ake.designpattern.common.ShapeType;

public class Square extends Shape{

	public Square(){
		type = ShapeType.SQUARE;
	}
	
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
