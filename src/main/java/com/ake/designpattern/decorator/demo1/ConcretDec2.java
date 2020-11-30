package com.ake.designpattern.decorator.demo1;

public class ConcretDec2 extends Decorator{

	public ConcretDec2(Comp com) {
		super(com);
	}

	@Override
	public void opr() {
		comp.opr();
		System.out.println("do more things 2");
	}

}
