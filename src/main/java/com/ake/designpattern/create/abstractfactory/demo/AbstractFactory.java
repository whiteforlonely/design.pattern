package com.ake.designpattern.create.abstractfactory.demo;

/**
 * 这是是创建一个完整商品的抽象工厂类
 * @author Saturday
 * @date 2018-6-20 下午12:05:40
 * @project design.pattern
 */
public abstract class AbstractFactory {

	public abstract Color getColor(String color);
	public abstract Shape getShape(String type);
}
