package com.wangdesen.dp.singleton;

/**
 * 非同步的单例模式----饿汉式
 * 
 * @author wangdesen
 * */
public class EagerSingleton implements Runnable{

	private EagerSingleton() {
		System.out.println("Singleton is create");
	}

	private static EagerSingleton instance = new EagerSingleton();

	public static EagerSingleton getInstance() {
		return instance;
	}

	public static void createString() {
		System.out.println("createString in Singleton");
	}
	
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			EagerSingleton.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new EagerSingleton()).start();
		}
	}
}
