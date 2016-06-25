package com.wangdesen.dp.decorator.starbuzz.condiment;

import com.wangdesen.dp.decorator.starbuzz.beverage.Beverage;

/**
 * 抽象调料组件--负责动态包裹饮料实体
 * 
 * 利用继承达到“类型匹配”，而非获得“行为”
 * */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
