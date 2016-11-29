package com.wangdesen.dp.abstractFactory;

/**
 * 美的工厂[ConcreteFactory]
 * Ps:可以生产美的牌冰箱和洗衣机
 * 
 * @author wangdesen
 */
public class MideaConcreteFactory implements AbstractFactory {
	
	@Override
	public AbstractRefrigerator createRefrigerator() {
		return new MideaRefrigerator();
	}

	@Override
	public AbstractWashingMachine createWashingMachine() {
		return new MideaWashingMachine();
	}
	
}
