package com.ake.designpattern.observer.demo2;

import java.util.ArrayList;
import java.util.List;


public class Subject implements Observerable{
	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if (!observers.isEmpty()) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public void setInfo(){
		System.out.println("come to set info in subject...");
		notifyObserver();
	}

}
