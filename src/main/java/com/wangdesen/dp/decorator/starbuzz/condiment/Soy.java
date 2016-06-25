package com.wangdesen.dp.decorator.starbuzz.condiment;

import com.wangdesen.dp.decorator.starbuzz.beverage.Beverage;

/**
 * 大豆调料
 * 
 * @author wangdesen
 * */
public class Soy extends CondimentDecorator {
	
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
