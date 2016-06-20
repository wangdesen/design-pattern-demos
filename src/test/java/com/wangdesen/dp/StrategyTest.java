package com.wangdesen.dp;

import com.wangdesen.dp.strategy.context.Context;
import com.wangdesen.dp.strategy.strategy.ConcreteStrategy1;
import com.wangdesen.dp.strategy.strategy.ConcreteStrategy2;

/**
 * 策略模式测试类
 * 
 * @author wangdesen
 * @version 1.0
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
