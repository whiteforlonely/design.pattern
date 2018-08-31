package com.ake.designpattern.abstractfactory.demo;

import com.ake.designpattern.common.ShapeType;
import com.ake.designpattern.util.StringUtil;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if (StringUtil.isEmpty(shapeType)) {
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
