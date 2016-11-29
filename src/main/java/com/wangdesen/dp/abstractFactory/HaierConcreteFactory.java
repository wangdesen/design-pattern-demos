package com.wangdesen.dp.abstractFactory;

/**
 * 海尔工厂[ConcreteFactory]
 * Ps:可以生产海尔牌冰箱和洗衣机
 * 
 * @author wangdesen
 */
public class HaierConcreteFactory implements AbstractFactory {
	
	@Override
	public AbstractRefrigerator createRefrigerator() {
		return new HaierRefrigerator();
	}

	@Override
	public AbstractWashingMachine createWashingMachine() {
		return new HaierWashingMachine();
	}

}
