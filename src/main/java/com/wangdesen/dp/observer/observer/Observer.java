package com.wangdesen.dp.observer.observer;

/**
 * 定义观察者类--接口
 * 
 * @author wangdesen
 * */
public interface Observer {

	/**
	 * 观察者方法--更新数据
	 * 
	 * @param			temp			温度
	 * @param			humidity		湿度
	 * @param			pressure		气压
	 * */
	public void update(float temp, float humidity, float pressure);
}
