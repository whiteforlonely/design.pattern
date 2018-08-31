package com.ake.designpattern.state.demo2;

//沒有投币状态
public class SoldOutState implements State{
	
	@SuppressWarnings("unused")
	private GumballMachine machine;
	
	public SoldOutState(GumballMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");  
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");  
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
	
	@Override
	public String toString() {
		return "sold out";
	}

}
