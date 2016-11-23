package com.wangdesen.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类(Java反射机制)
 * 当我们通过代理对象调用一个方法的时候，这个方法的调用就会被转发为由InvocationHandler这个接口的 invoke 方法来进行调用
 * 
 * 还没有完全搞明白
 * 
 * DBQuery处理器
 * 
 * @author wangdesen
 * */
public class DBQueryHandler implements InvocationHandler {

	IDBQuery realQuery = null;// 定义主题接口

	/**
	 * proxy : 我们所代理的真实对象
	 * method : 我们所要调用真实对象的某个方法的Method对象
	 * args : 调用真实对象某个方法时接收的参数
	 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 如果第一次调用，生成真实主题
		if (realQuery == null) {
			realQuery = new DBQuery();
		}
		// 返回真实主题完成实际的操作
		return realQuery.request();
	}
	
	/**
	 * 反射加载真实主题
	 * 
	 * newProxyInstance:得到一个动态的代理对象
	 * 
	 * @param	loader:一个ClassLoader对象，定义由哪个classLoader对象来对生成的代理对象进行加载
	 * @param	interface:一个Interface对象的数组，标识将要给需要代理的对象提供一组什么养的接口
	 * @param	h:一个InvocationHandler对象，表示当我这个动态代理对象在调用方法时，会关联到哪一个invocationHandler对象上
	 * */
	public IDBQuery createProxy(){
		IDBQuery proxy = (IDBQuery)Proxy.newProxyInstance(
			ClassLoader.getSystemClassLoader(), new Class[]{IDBQuery.class}, new DBQueryHandler()
		);
		return proxy;
	}

}
