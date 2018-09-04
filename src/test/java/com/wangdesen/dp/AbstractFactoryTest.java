package com.wangdesen.dp;

import com.wangdesen.dp.abstractFactory.AbstractFactory;
import com.wangdesen.dp.abstractFactory.AbstractRefrigerator;
import com.wangdesen.dp.abstractFactory.AbstractWashingMachine;
import com.wangdesen.dp.abstractFactory.HaierConcreteFactory;
import com.wangdesen.dp.abstractFactory.MideaConcreteFactory;

/**
 * 抽象工厂模式测试类
 * 2018-09-04 导入
 * 
 * @author wangdesen
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		//海尔工厂生产一台冰箱一台洗衣机
		AbstractFactory haierFactory = new HaierConcreteFactory();
		AbstractRefrigerator haierRefrigerator = haierFactory.createRefrigerator();
		AbstractWashingMachine haierWashingMachine = haierFactory.createWashingMachine();
		haierRefrigerator.storeFood();
		haierWashingMachine.washingClothes();
		
		//美的工厂生产一台冰箱一台洗衣机
		AbstractFactory mideaFactory = new MideaConcreteFactory();
		AbstractRefrigerator mideaRefrigerator = mideaFactory.createRefrigerator();
		AbstractWashingMachine mideaWashingMachine = mideaFactory.createWashingMachine();
		mideaRefrigerator.storeFood();
		mideaWashingMachine.washingClothes();
	}

}
