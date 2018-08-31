package com.ake.designpattern.bridge.demo3;

public class SmallPen extends Pen{

	@Override
	public void draw(String name) {
		this.color.bepaint("small pen", name);
	}

}
