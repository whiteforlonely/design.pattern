package com.ake.designpattern.bridge.demo3;

public class BigPen extends Pen{

	@Override
	public void draw(String name) {
		this.color.bepaint("big pen", name);
	}

}
