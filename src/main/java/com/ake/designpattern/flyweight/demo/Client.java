package com.ake.designpattern.flyweight.demo;

/**
 * 享元模式测试
 * @author Saturday
 * @date 2018-6-5 下午8:23:14
 * @project design.pattern
 */
public class Client {

	private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	
	private static String getRandomColor(){
		return colors[(int) (Math.random() * colors.length)];
	}
	
	private static int getRandomX(){
		return (int) (Math.random() * 100);
	}
	
	private static int getRandomY(){
		return (int) (Math.random() * 100);
	}
}
