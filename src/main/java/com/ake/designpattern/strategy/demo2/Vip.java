package com.ake.designpattern.strategy.demo2;

@PriceRegion(max = 20000)
public class Vip implements CalPrice {

	@Override
	public Double calPrice(Double orgnicPrice) {
		// TODO Auto-generated method stub
		return orgnicPrice * 0.9;
	}

}
