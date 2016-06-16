package com.wangdesen.dp.singleton;

/**
 * 使用内部类来维护单例的实例----线程安全，延迟加载
 * 
 * @author wangdesen
 * */
public class StaticSingleton implements Runnable{

	private StaticSingleton() {
		System.out.println("StaticSingleton is create");
	}

	//StaticSingleton被加载时，内部类不会初始化。
	
	//可以确保StaticSingleton被载入JVM时，不会初始化单例类
		
	//调用getInstance时记载SingleHolder，从而初始化instance
		
	//由于类的建立是在类加载时完成，固对线程友好，getInstance方法也无需使用synchronized关键字
	private static class SingletonHolder {
		private static StaticSingleton instance = new StaticSingleton();
	}

	public static StaticSingleton getInstance() {
		return SingletonHolder.instance;
	}
	
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			StaticSingleton.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new StaticSingleton()).start();
		}
	}
}
