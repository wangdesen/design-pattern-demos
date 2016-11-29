package com.wangdesen.dp.abstractFactory;

/**
 * 美的洗衣机
 * 
 * @author wangdesen
 */
public class MideaWashingMachine implements AbstractWashingMachine{

	@Override
	public void washingClothes() {
		System.out.println("欢迎使用美的牌洗衣机，衣服从此更美的！");
	}

}
