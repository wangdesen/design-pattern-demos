package com.wangdesen.dp.observer.subject;

import java.util.ArrayList;

import com.wangdesen.dp.observer.observer.Observer;

/**
 * 气象数据--主题实体
 * 
 * @author wangdesen
 * */
public class WeatherData implements Subject {
	
	private ArrayList<Object> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
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
	
	//气象数据发生改变触发事件
	public void measurementsChanged(){
		notifyObserver();
	}
	
	//设置气象数据
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//每次设置完成，就通知观察者
		measurementsChanged();
	}

}
