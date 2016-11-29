package com.wangdesen.dp;

import com.wangdesen.dp.strategy.ConcreteStrategy1;
import com.wangdesen.dp.strategy.ConcreteStrategy2;
import com.wangdesen.dp.strategy.Context;

/**
 * 策略模式测试类
 * 
 * @author wangdesen
 * */
public class StrategyTest {

	public static void main(String[] args) {
		Context context;
		context = new Context(new ConcreteStrategy1());
		context.operate();
		System.out.println("\n");
		context.setStrategy(new ConcreteStrategy2());
		context.operate();
	}

}
