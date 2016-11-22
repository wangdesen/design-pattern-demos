package com.wangdesen.dp.bridge;

/**
 * 抽象类
 * 
 * 汽车抽象类
 * 
 * @author wangdesen
 * */
public abstract class Car {

	private Engine engine;
	
	public Car(Engine engine){
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/**
	 * 安装引擎
	 * */
	public abstract void installEngine();
}
