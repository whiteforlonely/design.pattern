package com.ake.designpattern.flyweight.demo;

import java.util.HashMap;

public class ShapeFactory {
	
	private static final HashMap<String, Shape> circleMap = new HashMap<>();
	
	public static Shape getShape(String color){
		Circle circle = (Circle) circleMap.get(color);
		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("create circle of color: " + color);
		}
		
		return circle;
	}
}
