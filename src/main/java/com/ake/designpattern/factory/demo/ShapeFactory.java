package com.ake.designpattern.factory.demo;

import com.ake.designpattern.common.ShapeType;

public class ShapeFactory {

	public Shape getShape(String shapeType){
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType.equals(ShapeType.CIRCLE)) {
			return new Circle();
		}else if (shapeType.equals(ShapeType.SQUARE)) {
			return new Square();
		}else if (shapeType.equals(ShapeType.RECTANGLE)) {
			return new Rectangle();
		}
		
		return null;
	}
}
