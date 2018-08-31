package com.ake.designpattern.bridge.demo;

public class RedCircle implements DrawApi{

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		 System.out.println("Drawing Circle[ color: red, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}

}