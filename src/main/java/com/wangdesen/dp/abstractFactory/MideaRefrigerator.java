package com.wangdesen.dp.abstractFactory;

/**
 * 美的冰箱
 * 
 * @author wangdesen
 */
public class MideaRefrigerator implements AbstractRefrigerator {

	@Override
	public void storeFood() {
		System.out.println("欢迎使用美的牌冰箱，一晚仅需一度电！");
	}

}
