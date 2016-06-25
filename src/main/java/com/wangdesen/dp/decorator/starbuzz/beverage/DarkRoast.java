package com.wangdesen.dp.decorator.starbuzz.beverage;


/**
 * 焦糖咖啡
 * 
 * @author wangdesen
 * */
public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

