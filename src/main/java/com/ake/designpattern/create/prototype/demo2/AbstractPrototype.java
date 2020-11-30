package com.ake.designpattern.create.prototype.demo2;

/*
 * 原型抽象接口，对于很对的实例来说，有的理解好像又是不一样的。
 * 这边的克隆，没有真正的克隆，只是返回对象本身的一个引用，也就是
 * 在内存中使用的是同一个对象。
 */
public abstract class AbstractPrototype {

	public AbstractPrototype cloneMySelf(){
		return this;
	}
	
	public abstract void addSomeIntroduction(String topic, String content);
	
	public abstract void deleteSomeIntroduction(String key);
	
	public abstract void showIntroduction();
}
