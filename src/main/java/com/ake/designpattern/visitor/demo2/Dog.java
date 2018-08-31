package com.ake.designpattern.visitor.demo2;

public class Dog implements Animal{

	@Override
	public void accept(Person person) {
		person.feed(this);
		System.out.println("I am a dog, this is nice!");
	}
}
