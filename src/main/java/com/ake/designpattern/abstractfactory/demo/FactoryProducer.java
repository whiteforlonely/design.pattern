package com.ake.designpattern.abstractfactory.demo;

import com.ake.designpattern.common.FactoryType;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType){
		if (factoryType.equalsIgnoreCase(FactoryType.COLOR)) {
			return new ColorFactory();
		}else if (factoryType.equalsIgnoreCase(FactoryType.SHAPE)) {
			return new ShapeFactory();
		}
		
		return null;
	}
}
