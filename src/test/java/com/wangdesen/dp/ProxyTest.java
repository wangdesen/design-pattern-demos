package com.wangdesen.dp;

import org.junit.Test;

import com.wangdesen.dp.proxy.proxy.DBQueryHandler;
import com.wangdesen.dp.proxy.proxy.DBQueryProxy;
import com.wangdesen.dp.proxy.theme.IDBQuery;

public class ProxyTest {

	//懒加载代理
	@Test
	public void IDBQueryTest(){
		IDBQuery q = new DBQueryProxy(); // 使用代理
		System.out.println(q.request()); // 在真正使用时才创建真实对象----延迟加载
	}
	
	//利用反射动态代理
	@Test
	public void DBQueryHandlerTest(){
		DBQueryHandler q = new DBQueryHandler();
		System.out.println(q.createProxy());
	}
	
	
}
