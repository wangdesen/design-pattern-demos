package com.wangdesen.dp.decorator.starbuzz.beverage;

/**
 * 综合咖啡
 * 
 * @author wangdesen
 * */
public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

