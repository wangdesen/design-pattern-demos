package com.wangdesen.dp.observer;

/**
 * Observer(观察者)
 * 
 * @author wangdesen
 * */
public interface Observer {

	/**
	 * 观察者更新数据
	 * 
	 * @param temp			温度
	 * @param humidity 	湿度
	 * @param pressure		气压
	 */
	public void update(float temp, float humidity, float pressure);
}
