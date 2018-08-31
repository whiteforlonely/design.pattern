package com.ake.designpattern.observer.demo2;

public interface Observerable {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
