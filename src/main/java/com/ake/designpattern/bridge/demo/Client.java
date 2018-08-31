package com.ake.designpattern.bridge.demo;

/**
 * 这个是桥接模式，但是这边还没有卡出什么端倪，
 * drawApi就相当是一个抽象实现类，扩充的抽象类Shape
 * 是一个图形对象的抽象类，里面把行为放置在DrawApi，并进行关联
 * 
 * @author Saturday
 * @date 2018-6-20 下午4:26:18
 * @project design.pattern
 */
public class Client {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}
}
