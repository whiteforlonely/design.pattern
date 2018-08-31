package com.ake.designpattern.state.demo3;


public class Lift {

	private State stopState;
	private State runState;
	private State openState;
	private State closeState;
	
	private State state;

	public Lift() {
		
		stopState = new StopState(this);
		runState = new RunState(this);
		openState = new OpenDoorState(this);
		closeState = new CloseDoorState(this);
		
		state = closeState;
	}
	
	public void openDoor(){
		state.openDoor();
	}
	
	public void closeDoor(){
		state.closeDoor();
	}
	
	public void run(){
		state.run();
	}
	
	public void stop(){
		state.stop();
	}
	
	public State getStopState() {
		return stopState;
	}

	public void setStopState(State stopState) {
		this.stopState = stopState;
	}

	public State getRunState() {
		return runState;
	}

	public void setRunState(State runState) {
		this.runState = runState;
	}

	public State getOpenState() {
		return openState;
	}

	public void setOpenState(State openState) {
		this.openState = openState;
	}

	public State getCloseState() {
		return closeState;
	}

	public void setCloseState(State closeState) {
		this.closeState = closeState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
