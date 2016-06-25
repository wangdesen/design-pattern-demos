package com.wangdesen.dp.decorator.starbuzz.condiment;

import com.wangdesen.dp.decorator.starbuzz.beverage.Beverage;

/**
 * 奶油调料
 * 
 * @author wangdesen
 * */
public class Whip extends CondimentDecorator {
	
	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
