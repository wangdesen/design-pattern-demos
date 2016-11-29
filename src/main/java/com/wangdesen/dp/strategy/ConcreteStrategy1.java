package com.wangdesen.dp.strategy;

/**
 * 实体策略1
 * 
 * @author wangdesen
 * */
public class ConcreteStrategy1 implements Strategy {

	@Override
	public void operate() {
		System.out.println("plan A");
	}

}
