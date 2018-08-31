package com.ake.designpattern.state.demo;

/**
 * this state pattern looks ridiculous here, 
 * so, what can this pattern use for, and 
 * what kind of situation of this pattern can use to.
 * 
 * the kernel code is, create a state interface, 
 * and the create some instance of the state interface.
 * and in these state, you should hold the context, and
 * the action should appear in the state object, then, 
 * as you do change the state in the state object, then the 
 * context in the state object should change the state immediately
 * and then you can provide a interface to access the state of the
 * context, test this pattern.
 * 
 * this pattern is order to resolve the problem when one object 
 * behavior depends on the object state, and as the state changes, the 
 * behavior will change too.
 * @author Saturday
 * @date 2018-6-21 下午2:22:29
 * @project design.pattern
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());
	}
}
