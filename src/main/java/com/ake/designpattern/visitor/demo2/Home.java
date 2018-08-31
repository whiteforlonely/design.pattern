package com.ake.designpattern.visitor.demo2;

public class Home {

	private Animal[] animals = new  Animal[]{new Dog(), new Dog(), new Cat()};
	
	public void action(Person person){
		for (int i = 0; i < animals.length; i++) {
			animals[i].accept(person);
		}
	}
}
