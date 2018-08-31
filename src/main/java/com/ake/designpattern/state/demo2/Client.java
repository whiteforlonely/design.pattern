package com.ake.designpattern.state.demo2;

/**
 * the machine has four states, and every state
 * has a state instance implements from interface
 * state. and in the state interface, you can just 
 * define the action you should do in current status,
 * or it is said that you should define the behaviors
 * in the machine. and, is this necessary that 
 * the machine should use the method defined in the 
 * status? 
 * @author Saturday
 * @date 2018-6-21 下午3:19:20
 * @project design.pattern
 */
public class Client {

	public static void main(String[] args) {
		GumballMachine machine = new GumballMachine(3);
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine);
		machine.insertQuarter();
		machine.turnCrank();
		machine.insertQuarter();
		machine.turnCrank();
		machine.insertQuarter();
		machine.turnCrank();
		System.out.println(machine);
	}
}
