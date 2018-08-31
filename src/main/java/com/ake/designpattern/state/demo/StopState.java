package com.ake.designpattern.state.demo;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "StopState []";
	}

}
