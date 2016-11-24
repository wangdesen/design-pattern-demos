package com.wangdesen.dp.observer;


/**
 * 定义主题类--接口
 * 
 * @author wangdesen
 * */
public interface Subject {

	//注册观察者
	public void registerObserver(Observer o);
	
	//移除观察者
	public void removeObserver(Observer o);
	
	//通知观察者
	public void notifyObserver();
	
}
