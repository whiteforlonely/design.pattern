package com.ake.designpattern.strategy.demo2;

@PriceRegion(min = 30000)
public class GoldVip implements CalPrice {

	@Override
	public Double calPrice(Double orgnicPrice) {
		// TODO Auto-generated method stub
		return orgnicPrice * 0.7;
	}

}
