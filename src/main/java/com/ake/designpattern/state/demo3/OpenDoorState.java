package com.ake.designpattern.state.demo3;

public class OpenDoorState implements State{
	
	private Lift lift;
	
	public OpenDoorState(Lift lift){
		this.lift = lift;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("the lift has stopped!");
		lift.setState(lift.getStopState());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("the lift can not run while the door is openned!");
	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("the lift has openned door!");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("the lift start to close door!");
		lift.setState(lift.getCloseState());
	}

}
