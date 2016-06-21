package com.wangdesen.dp.proxy;

/**
 * 真实主题
 * 
 * @author wangdesen
 * @version 1.0
 * */
public class DBQuery implements IDBQuery {

	public DBQuery() {
		try {
			Thread.sleep(1000);// 假设数据库连接等耗时操作
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public String request() {
		return "response the request!";
	}

}
