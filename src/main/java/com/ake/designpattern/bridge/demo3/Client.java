package com.ake.designpattern.bridge.demo3;

public class Client {

	public static void main(String[] args) {
		Pen smallPen = new SmallPen();
		Pen middelPen = new MiddlePen();
		Pen bigPen = new BigPen();
		
		smallPen.setColor(new Red());
		middelPen.setColor(new Green());
		bigPen.setColor(new Red());
		
		smallPen.draw("Dog");
		middelPen.draw("Cat");
		bigPen.draw("Sky");
	}
}
