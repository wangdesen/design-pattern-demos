package com.wangdesen.dp.proxy;

/**
 * IDBQuery的代理类
 * 
 * @author wangdesen
 * */
public class DBQueryProxy implements IDBQuery {

	private DBQuery real = null;

	public String request() {
		// TODO Auto-generated method stub
		// 在真正需要的时候才能创建真实对象，创建过程可能很慢
		if (real == null) {
			real = new DBQuery();
		}// 在多线程环境下，这里返回一个虚假类，类似于 Future 模式
		return real.request();
	}

}
