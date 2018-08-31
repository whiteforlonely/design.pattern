package com.ake.designpattern.visitor.demo3;

public class View1 extends Viewer{

	@Override
	void view(BillComsume bill) {
		// TODO Auto-generated method stub
		System.out.println("here is viewer 1 visiter bill comsume.");
	}
	
	@Override
	void view(BillInCome bill) {
		// TODO Auto-generated method stub
		
	}

}
