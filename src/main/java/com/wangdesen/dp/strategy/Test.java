package com.wangdesen.dp.strategy;

/**
 * 策略模式测试类
 * 
 * @author wangdesen
 * */
public class Test {

	public static void main(String[] args) {
		
		Context context;
		
		context = new Context(new ConcreteStrategy1());
		context.operate();
		System.out.println("\n");
		
		context.setStrategy(new ConcreteStrategy2());
		context.operate();
		System.out.println("\n");

	}

}
