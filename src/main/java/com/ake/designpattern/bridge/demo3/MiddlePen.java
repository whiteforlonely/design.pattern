package com.ake.designpattern.bridge.demo3;

public class MiddlePen extends Pen{

	@Override
	public void draw(String name) {
		this.color.bepaint("middle pen", name);
	}

}
