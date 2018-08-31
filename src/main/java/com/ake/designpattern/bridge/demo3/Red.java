package com.ake.designpattern.bridge.demo3;

public class Red implements Color{

	@Override
	public void bepaint(String penType, String name) {
		// TODO Auto-generated method stub
		System.out.println(penType+" paint red "+name);
	}

}
