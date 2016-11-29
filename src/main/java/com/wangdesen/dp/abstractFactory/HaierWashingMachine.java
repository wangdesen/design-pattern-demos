package com.wangdesen.dp.abstractFactory;

/**
 * Haier牌洗衣机
 * 
 * @author wangdesen
 */
public class HaierWashingMachine implements AbstractWashingMachine {

	@Override
	public void washingClothes() {
		System.out.println("欢迎使用Haier牌洗衣机，更安静的洗衣体验！");
	}

}
