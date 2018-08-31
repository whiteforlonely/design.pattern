package com.ake.designpattern.bridge.demo;

/**
 * 具体的操作行为类
 * @author Saturday
 * @date 2018-6-20 下午5:01:40
 * @project design.pattern
 */
public class GreenCircle implements DrawApi{

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		 System.out.println("Drawing Circle[ color: green, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}

}
