package com.ake.designpattern.visitor.demo2;

public class VisitorPatternDemo2 {

	public static void main(String[] args) {
		Home home = new Home();
		home.action(new Owner());
	}
}
