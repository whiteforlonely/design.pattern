package com.ake.designpattern.create.prototype.demo3;

public class UnderlinePen implements Product {

	private char ulchar;

	@Override
	public void user(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		for (int i = 0; i < length + 2; i++) {
			System.out.print(ulchar);

		}
		System.out.println("");
	}

	public UnderlinePen(char ulchar) {
		super();
		this.ulchar = ulchar;
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
