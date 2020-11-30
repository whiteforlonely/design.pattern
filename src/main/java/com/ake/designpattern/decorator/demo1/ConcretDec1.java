package com.ake.designpattern.decorator.demo1;

public class ConcretDec1 extends Decorator{

	public ConcretDec1(Comp com) {
		super(com);
	}

	@Override
	public void opr() {
		comp.opr();
		System.out.println("do more other things one.");
	}

}
