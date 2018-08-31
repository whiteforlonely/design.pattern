package com.ake.designpattern.bridge.demo2;

public class Client {

	public static void main(String[] args) {
		RefinedAbstract abstract1 = new RefinedAbstract();
		abstract1.setImplement(new ImplConcrete());
		abstract1.operate();
	}
}
