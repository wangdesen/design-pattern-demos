package com.wangdesen.dp.proxy;

/**
 * Subject(抽象主题角色)
 * 主题接口，定义代理类和真实类需要对外提供的服务
 * 
 * @author wangdesen
 * */
public interface IDBQuery {

	/**
	 * 请求
	 * */
	public abstract String request();
}
