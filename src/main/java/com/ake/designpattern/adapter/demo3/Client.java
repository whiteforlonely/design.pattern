package com.ake.designpattern.adapter.demo3;

/**
 * 这边是对象适配模式
 * @author Saturday
 * @date 2018-6-20 下午8:22:42
 * @project design.pattern
 */
public class Client {

	public static void main(String[] args) {
		UsbAdapter adapter = new UsbAdapter(new USB2());
		adapter.isPs2();
	}
}
