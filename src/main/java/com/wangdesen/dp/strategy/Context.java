package com.wangdesen.dp.strategy;


/**
 * 环境类
 * 
 * @author wangdesen
 * */
public class Context {

	/**
	 * 策略
	 */
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * 操作----执行当前策略的操作方法
	 */
	public void operate(){
		this.strategy.operate();
	}
}
