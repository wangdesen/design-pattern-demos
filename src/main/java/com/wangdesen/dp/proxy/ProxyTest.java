package com.wangdesen.dp.proxy;

import org.junit.Test;

public class ProxyTest {

	//
	@Test
	public void DBQueryHandlerTest(){
		DBQueryHandler q = new DBQueryHandler();
		System.out.println(q.createProxy());
	}
	
	//懒加载代理
	@Test
	public void IDBQueryTest(){
		IDBQuery q = new DBQueryProxy(); // 使用代理
		System.out.println(q.request()); // 在真正使用时才创建真实对象----延迟加载
	}
}
