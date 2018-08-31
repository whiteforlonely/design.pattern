package com.ake.designpattern.visitor.demo3;

public class BillInCome implements Bill{

	@Override
	public void accept(Viewer viewer) {
		// TODO Auto-generated method stub
		viewer.view(this);
	}

}
