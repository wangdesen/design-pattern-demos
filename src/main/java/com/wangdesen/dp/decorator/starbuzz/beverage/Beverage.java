package com.wangdesen.dp.decorator.starbuzz.beverage;

/**
 * Component
 * 
 * 饮料基类--抽象类
 * 
 * @author wangdesen
 * */
public abstract class Beverage {
	
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	/**
	 * 饮料原始费用
	 * */
	public abstract double cost();
}
