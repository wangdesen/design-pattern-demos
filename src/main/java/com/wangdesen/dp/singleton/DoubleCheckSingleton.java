package com.wangdesen.dp.singleton;

/**
 * 双重检验锁，一次在同步块外，一次在同步块内
 * 
 * 优点：线程安全，高效
 * 
 * 缺点：instance = new DoubleCheckSingleton()不是原子操作，可能返回空的实例
 * 
 * @author wangdesen
 * */
public class DoubleCheckSingleton {

	private DoubleCheckSingleton() {
		System.out.println("Singleton is create");
	}

	private static DoubleCheckSingleton instance ;

	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {                         //Single Checked
	        synchronized (DoubleCheckSingleton.class) {
	            if (instance == null) {                 //Double Checked
	                instance = new DoubleCheckSingleton();
	            }
	        }
	    }
	    return instance ;
	}
}
