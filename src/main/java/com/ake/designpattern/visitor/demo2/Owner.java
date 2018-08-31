package com.ake.designpattern.visitor.demo2;

public class Owner implements Person{

	@Override
	public void feed(Cat cat) {
		// TODO Auto-generated method stub
		System.out.println("the owner feed cat. ");
	}

	@Override
	public void feed(Dog cat) {
		// TODO Auto-generated method stub
		System.out.println("the owner feed dog.");
	}

}
