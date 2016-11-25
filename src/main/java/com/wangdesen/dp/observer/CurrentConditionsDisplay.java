package com.wangdesen.dp.observer;

/**
 * ConcreteObserver(气象公告栏)
 * 
 * @author wangdesen
 * */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	/**
	 * 构造方法--将公告栏注册到气象数据通知列表
	 * 
	 * @param weatherData
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		//拿到气象数据
		this.weatherData = weatherData;
		//将气象公告栏注册为观察者
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
				+ "F degree and " + humidity + "% humidity and " + pressure + "%pressure.");
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
