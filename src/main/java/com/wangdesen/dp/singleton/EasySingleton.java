package com.wangdesen.dp.singleton;

/**
 * 枚举单例
 * 
 * 线程安全，而且能防止反序列化导致的重新创建对象
 * 
 * @author wangdesen
 * */
public enum EasySingleton {
	
	INSTANCE;
}
