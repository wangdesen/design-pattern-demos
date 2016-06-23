package com.wangdesen.dp.singleton;

/**
 * 懒汉式--线程安全（加锁）
 * 
 * 优点：线程安全
 * 
 * 缺点：效率低下
 * 
 * @author wangdesen
 * */
public class LazySingleton{
	
	private LazySingleton() {
		System.out.println("LazySingleton is create");
	}
	
	//对于静态变量instance赋值为null，确保在系统启动时没有额外的加载
	private static LazySingleton instance = null;

	//getInstance必须是同步的，因为在多线程环境下可能存在多个实例被创建
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}
