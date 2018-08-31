package com.ake.designpattern.strategy.demo2;

@PriceRegion(min = 20000, max= 30000)
public class SuperVip implements CalPrice {

	@Override
	public Double calPrice(Double orgnicPrice) {
		// TODO Auto-generated method stub
		return orgnicPrice * 0.8;
	}

}
