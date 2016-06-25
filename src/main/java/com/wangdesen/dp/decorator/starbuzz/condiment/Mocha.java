package com.wangdesen.dp.decorator.starbuzz.condiment;

import com.wangdesen.dp.decorator.starbuzz.beverage.Beverage;

/**
 * 摩卡调料
 * 
 * @author wangdesen
 * */
public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
