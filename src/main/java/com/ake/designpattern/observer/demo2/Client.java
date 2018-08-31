package com.ake.designpattern.observer.demo2;

public class Client {

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.registerObserver(new Observer() {
			
			@Override
			public void update() {
				// TODO Auto-generated method stub
				System.out.println("here is the observer need to update....");
			}
		});
		subject.setInfo();
	}
}
