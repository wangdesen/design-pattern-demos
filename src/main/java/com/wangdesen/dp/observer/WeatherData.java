package com.wangdesen.dp.observer;

import java.util.ArrayList;

/**
 * ConcreteSubject(气象数据)
 * 
 * @author wangdesen
 * */
public class WeatherData implements Subject {
	
	//观察者列表
	private ArrayList<Object> observers;
	
	//天气数据
	private float temperature;
	private float humidity;
	private float pressure;
	
	//初始化观察者列表
	public WeatherData(){
		observers = new ArrayList<Object>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i > 0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for(int i = 0 ; i < observers.size() ; i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}

	}
	
	/**
	 * 气象数据发生改变触发事件
	 */
	public void measurementsChanged(){
		//通知观察者
		notifyObserver();
	}
	
	/**
	 * 设置气象数据
	 * 
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//每次设置完成，就通知观察者
		measurementsChanged();
	}

}
