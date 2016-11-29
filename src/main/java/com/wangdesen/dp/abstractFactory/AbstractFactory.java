package com.wangdesen.dp.abstractFactory;

/**
 * 抽象工厂
 * Ps:这是一个可以生产各种机器的抽象工厂
 * 
 * @author wangdesen
 * @date 2016-11-29 14:39:59
 */
public interface AbstractFactory {

	/**
	 * 生产冰箱
	 * @return
	 */
	public AbstractRefrigerator createRefrigerator();
	
	
	/**
	 * 生产洗衣机
	 * @return
	 */
	public AbstractWashingMachine createWashingMachine();
}
