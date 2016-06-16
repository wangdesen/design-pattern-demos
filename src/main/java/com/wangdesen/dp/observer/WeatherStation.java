package com.wangdesen.dp.observer;


/**
 * 气象站--测试观察者模式
 * 
 * @author wangdesen
 * */
public class WeatherStation {

	public static void main(String[] args) {
		
		//实例化气象数据
		WeatherData weatherData = new WeatherData();
		//实例化气象公告栏
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		//更新气象数据
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

	}

}
