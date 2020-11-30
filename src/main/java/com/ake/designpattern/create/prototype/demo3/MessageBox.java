package com.ake.designpattern.create.prototype.demo3;

public class MessageBox implements Product {

	private char decochar;

	public MessageBox(char decoChar) {
		this.decochar = decoChar;
	}

	@Override
	public void user(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return p;
	}

}
