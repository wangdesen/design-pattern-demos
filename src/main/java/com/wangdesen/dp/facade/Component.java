package com.wangdesen.dp.facade;

/**
 * 电脑零件
 * 
 * @author wangdesen
 * */
public interface Component {

	/**
	 * 启动
	 * */
	public abstract void startup();
	
	/**
	 * 关停
	 * */
	public abstract void shutdown();
}
