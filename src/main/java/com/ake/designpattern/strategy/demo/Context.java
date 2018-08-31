package com.ake.designpattern.strategy.demo;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy = strategy;
	}
	
	public void contextInterface(){
		strategy.strategyInterface();
	}
}
