package com.ake.designpattern.visitor.demo;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
