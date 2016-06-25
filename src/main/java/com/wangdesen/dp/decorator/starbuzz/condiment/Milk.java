package com.wangdesen.dp.decorator.starbuzz.condiment;

import com.wangdesen.dp.decorator.starbuzz.beverage.Beverage;

/**
 * 牛奶调料
 * 
 * @author wangdesen
 * */
public class Milk extends CondimentDecorator {
	
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
