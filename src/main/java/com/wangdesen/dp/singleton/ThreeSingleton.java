package com.wangdesen.dp.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * LazySington Lasted Version
 * 
 * 单例容器
 * 
 * @author wangdesen
 * */
public class ThreeSingleton {
	
	//为后面使用的 key 定义一个前缀
	private final static String DEFAULT_PREKEY = "cache";
	//定义缓存实例的容器
	private static Map<String,ThreeSingleton>map = new HashMap<String,ThreeSingleton>();
	//定义初始化实例数目为 1
	private static int number = 1;
	private final static int NUM_MAX = 3;
	 
	private ThreeSingleton(){}
	
	public static synchronized ThreeSingleton getInstance(){
		 //通过缓存理念及方式控制数量
		 String key = DEFAULT_PREKEY + number;
		 ThreeSingleton threeSingleton = map.get(key);
		 if(threeSingleton==null){
			 threeSingleton = new ThreeSingleton();
			 map.put(key, threeSingleton);
		 }
		 number++;//实例数目加 1
		 if(number>NUM_MAX){
			 number=1;
		 }
		 return threeSingleton;
	 }
	 
	 public static void main(String args[]){
		 ThreeSingleton t1 = getInstance();
		 ThreeSingleton t2 = getInstance();
		 ThreeSingleton t3 = getInstance();
		 ThreeSingleton t4 = getInstance();
		 ThreeSingleton t5 = getInstance();
		 ThreeSingleton t6 = getInstance();
		 System.out.println(t1.toString());
		 System.out.println(t2.toString());
		 System.out.println(t3.toString());
		 System.out.println(t4.toString());
		 System.out.println(t5.toString());
		 System.out.println(t6.toString());
	 }

}
