package com.ake.designpattern.state.demo2;

//沒有投币状态
public class NoQuarterState implements State{
	
	private GumballMachine machine;
	
	public NoQuarterState(GumballMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");  
		machine.setState(machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");  
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}
	
	@Override
	public String toString() {
		return "waiting for quarter";
	}

}
