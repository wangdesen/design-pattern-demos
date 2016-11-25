package com.wangdesen.dp.observer;

/**
 * Subject(目标)
 * 
 * @author wangdesen
 * */
public interface Subject {

	/**
	 * 注册观察者
	 * */
	public void registerObserver(Observer o);
	
	/**
	 * 移出观察者
	 * */
	public void removeObserver(Observer o);
	
	/**
	 * 通知观察者
	 * */
	public void notifyObserver();
	
}
