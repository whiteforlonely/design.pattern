package com.ake.designpattern.visitor.demo2;

public class Someone implements Person{

	@Override
	public void feed(Cat cat) {
		// TODO Auto-generated method stub
		System.out.println("someone feed cat.");
	}

	@Override
	public void feed(Dog cat) {
		// TODO Auto-generated method stub
		System.out.println("someoen feed dog.");
	}

}
