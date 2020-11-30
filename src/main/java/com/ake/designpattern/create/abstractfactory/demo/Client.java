package com.ake.designpattern.create.abstractfactory.demo;

import com.ake.designpattern.common.Colors;
import com.ake.designpattern.common.FactoryType;
import com.ake.designpattern.common.ShapeType;

public class Client {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
		
		shapeFactory.getShape(ShapeType.CIRCLE).draw();
		shapeFactory.getShape(ShapeType.SQUARE).draw();
		shapeFactory.getShape(ShapeType.RECTANGLE).draw();
		
		colorFactory.getColor(Colors.RED).fill();
		colorFactory.getColor(Colors.GREEN).fill();
		colorFactory.getColor(Colors.BLUE).fill();
	}
}
