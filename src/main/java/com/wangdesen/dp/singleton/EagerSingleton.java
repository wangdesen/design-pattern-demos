package com.wangdesen.dp.singleton;

/**
 * 饿汉式
 * 
 * 第一次加载类到内存时，就会被初始化，所以创建实例本身线程安全
 * 
 * 优点：线程安全
 * 
 * 缺点：不是懒加载，在某些场景无法使用；
 * 比如 Singleton 实例的创建是依赖参数或者配置文件的
 * 
 * @author wangdesen
 * */
public class EagerSingleton{

	private EagerSingleton() {
		System.out.println("Singleton is create");
	}

	private static final EagerSingleton instance = new EagerSingleton();

	public static EagerSingleton getInstance() {
		return instance;
	}
}
