package com.ake.designpattern.decorator.demo1;

public class Test {

	public static void main(String[] args) {
		Comp dec1 = new ConcretDec2( new ConcretDec1(new ConcretComp()));
		dec1.opr();
	}
}
