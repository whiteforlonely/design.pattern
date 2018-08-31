package com.ake.lattery;

public class Test {

	public static void main(String[] args) {
		DoubleColor doubleColor = new DoubleColor();
		BigHappy bigHappy = new BigHappy();
		
		System.err.println("双色球： ");
		doubleColor.generateRedBall();
		doubleColor.generateBlueBall();
		
		System.out.println("大乐透：");
		bigHappy.generateRedBall();
		bigHappy.generateBlueBall();
	}
}
