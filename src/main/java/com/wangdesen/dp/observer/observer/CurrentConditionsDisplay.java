package com.wangdesen.dp.observer.observer;

import com.wangdesen.dp.observer.subject.Subject;


/**
 * 气象公告栏--观察者实体类
 * 
 * @author wangdesen
 * */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		//拿到气象数据
		this.weatherData = weatherData;
		//将气象公告栏注册为观察者
		weatherData.registerObserver(this);
	}

	//展示气象数据
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
				+ "F degree and " + humidity + "% humidity and " + pressure + "%pressure.");

	}

	//更新气象数据
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();

	}

}
