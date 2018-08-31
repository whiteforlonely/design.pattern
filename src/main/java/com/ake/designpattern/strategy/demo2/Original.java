package com.ake.designpattern.strategy.demo2;

@PriceRegion(max = 10000)
public class Original implements CalPrice{

	@Override
	public Double calPrice(Double orgnicPrice) {
		// TODO Auto-generated method stub
		return orgnicPrice;
	}

}
