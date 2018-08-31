package com.ake.designpattern.state.demo3;

public class StopState implements State {
	
	private Lift lift;

	public StopState(Lift lift) {
		this.lift = lift;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("the lift has stopped!");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("the lift start to run!");
		lift.setState(lift.getRunState());
	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("the lift start to openDoor!");
		lift.setState(lift.getOpenState());
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("the lift has closed door!");
	}

}
