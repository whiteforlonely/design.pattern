package com.ake.designpattern.visitor.demo;

public class Computer implements ComputerPart{
	
	ComputerPart[] computerParts;
	
	public Computer(){
		computerParts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < computerParts.length; i++) {
			computerParts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
