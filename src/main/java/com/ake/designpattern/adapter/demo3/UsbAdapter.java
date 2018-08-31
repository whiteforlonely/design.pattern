package com.ake.designpattern.adapter.demo3;

public class UsbAdapter implements PS2{

	private USB2 usb2;
	
	public UsbAdapter(USB2 usb){
		this.usb2 = usb;
	}

	@Override
	public void isPs2() {
		usb2.isUsb();
	}
	
	
}
