package com.ake.designpattern.visitor.demo;

public class Monitor implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		computerPartVisitor.visit(this);
	}
}
