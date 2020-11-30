package com.ake.designpattern.create.prototype.demo2;

public class Client {

	/*
	 * 所以这边的原型模式，还是有点特点的。原型模式的根本就在于对象是在程序运行中创建的，是独立于整个
	 * 框架的时候，并且又多种形态的对象需要产生，这个时候，就是需要原型模式了吗。
	 * 1. 需要先创建原型，看作是一种类型的对象
	 * 2. 通过原型clone方法创建新的对象，这种对象是基于创建出来到的原型，但是
	 * 本身又是有一些区别的。
	 */
	public static void main(String[] args) {
		CompanyBaseIntroduction baseIntroduction = new CompanyBaseIntroduction();
		
		AbstractPrototype part1 = baseIntroduction.cloneMySelf();
		part1.addSomeIntroduction("partA", "Content of partA");
		part1.showIntroduction();
		
		AbstractPrototype part2 = baseIntroduction.cloneMySelf();
		part2.addSomeIntroduction("partB", "Content of partB");
		part2.showIntroduction();
		
	}
}
