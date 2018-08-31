package com.ake.designpattern.adapter.demo2;

public class UsbAdapter extends Usb2 implements PS2{

	@Override
	public void isPs() {
		//usb 转换成ps的一系列操作
		isUse();
	}

}
