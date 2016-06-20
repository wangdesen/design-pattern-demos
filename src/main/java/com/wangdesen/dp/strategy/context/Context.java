package com.wangdesen.dp.strategy.context;

import com.wangdesen.dp.strategy.strategy.Strategy;

/**
 * 环境类
 * 
 * @author wangdesen
 * */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void operate(){
		this.strategy.operate();
	}
}
