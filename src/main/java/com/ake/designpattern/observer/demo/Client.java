package com.ake.designpattern.observer.demo;

/**
 * So, from now on, I still can not understand
 * observer model very well, I still confuse.
 * Here check the demo, the subject is the object
 * you want to observer, so, as you have the listener in 
 * this subject, it is like the listener you set in 
 * the android view, the point is what, you should have
 * a observer in the subject, so that you can call the 
 * observer to execute the listener. and this is the point.
 * @author Saturday
 * @date 2018-6-21 下午12:05:27
 * @project design.pattern
 */
public class Client {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctlObserver(subject);
		new HexObserver(subject);
		
		subject.setState(10);
		subject.setState(15);
	}
}
