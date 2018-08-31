package com.ake.designpattern.state.demo3;

public class Client {

	public static void main(String[] args) {
		Lift lift = new Lift();
		
		lift.openDoor();
		lift.run();
		lift.closeDoor();
		lift.openDoor();
		lift.closeDoor();
		lift.run();
		lift.stop();
		lift.openDoor();
	}
}
