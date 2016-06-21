package com.wangdesen.dp.proxy;

/**
 * IDBQuery的代理类
 * 
 * @author wangdesen
 * @version 1.0
 * */
public class DBQueryProxy implements IDBQuery {

	//真实类初识为空
	private DBQuery real = null;

	public String request() {
		// 在真正需要的时候才能创建真实对象，创建过程可能很慢
		if (real == null) {
			real = new DBQuery();
		}
		// 在多线程环境下，这里返回一个虚假类，类似于 Future 模式
		return real.request();
	}

}
