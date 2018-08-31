package com.ake.designpattern.bridge.demo4;

/**
 * 这个是简洁版 的桥接模式示例，但是现在还是不清楚桥接模式应该是用在什么样的场合
 * 实现和抽象是分开的，具体是哪一种，这个很难判定的吧。
 * 可能说是为了易于扩展，可以使用这样的模式。
 * 这边应该说识事物和具体的设计模式分开来。而Shape就是所谓的事物，然后paint就是实现。
 * 这样子设计就把painter和shape独立分开来。
 * @author Saturday
 * @date 2018-6-20 下午7:41:18
 * @project design.pattern
 */
public class Client {

	public static void main(String[] args) {
		Painter painter = new RefinedPainter();
		painter.setShape(new Circle());
		painter.paintShape();
	}
}
