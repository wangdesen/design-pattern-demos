package com.wangdesen.dp.singleton;

/**
 * 同步的单例模式----懒汉式
 * 
 * @author wangdesen
 * */
public class LazySingleton implements Runnable {
	
	private LazySingleton() {
		System.out.println("LazySingleton is create");
	}
	
	//对于静态变量instance赋值为null，确保在系统启动时没有额外的加载
	private static LazySingleton instance = null;

	/**
	 * getInstance必须是同步的，因为在多线程环境下可能存在多个实例被创建
	 */
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			LazySingleton.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new LazySingleton()).start();
		}
	}

}
