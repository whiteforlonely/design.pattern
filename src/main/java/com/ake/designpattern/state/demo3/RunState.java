package com.ake.designpattern.state.demo3;


public class RunState implements State{

	private Lift lift;
	
	
	public RunState(Lift lift) {
		this.lift = lift;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("the lift start stopped!");
		lift.setState(lift.getStopState());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("the lift is running!");
	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("the lift cannot open door while it is running!");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("the lift has closed door!");
	}

}
