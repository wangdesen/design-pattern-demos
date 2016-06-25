package com.wangdesen.dp.decorator.starbuzz.beverage;

/**
 * 浓咖啡
 * 
 * @author wangdesen
 * */
public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

