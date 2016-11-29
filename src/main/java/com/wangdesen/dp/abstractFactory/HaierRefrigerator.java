package com.wangdesen.dp.abstractFactory;

/**
 * Haier牌冰箱
 * 
 * @author wangdesen
 */
public class HaierRefrigerator implements AbstractRefrigerator {

	@Override
	public void storeFood() {
		System.out.println("欢迎使用Haier牌冰箱，零度保鲜更新鲜！");
	}

}
