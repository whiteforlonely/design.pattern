package com.ake.designpattern.observer.demo;

public class OctlObserver extends Observer {

	public OctlObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octl String: "
				+ Integer.toOctalString(subject.getState()));
	}

}
