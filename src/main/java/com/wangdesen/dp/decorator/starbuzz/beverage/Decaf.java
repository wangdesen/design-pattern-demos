package com.wangdesen.dp.decorator.starbuzz.beverage;

/**
 * ConcreteComponent
 * 无咖啡因类咖啡
 * 
 * @author wangdesen
 * */
public class Decaf extends Beverage {
	
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

