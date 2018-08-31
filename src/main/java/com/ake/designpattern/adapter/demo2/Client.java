package com.ake.designpattern.adapter.demo2;

/**
 * 这示例主要是类适配器，还有一种是接口适配器，在之前的java swing
 * 中的间厅窗口事件，实现一个监听器需要又很多的空方法，因为我们实际上只需要其中的一个
 * 方法，这个就可以使用一个抽象的中间件，实现借口的所有的方法，而在我们需要监听窗口事件
 * 的时候，只需要实现我们需要的接口方法就可以。
 * @author Saturday
 * @date 2018-6-20 下午8:01:29
 * @project design.pattern
 */
public class Client {

	public static void main(String[] args) {
		UsbAdapter adapter = new UsbAdapter();
		adapter.isPs();
	}
}
