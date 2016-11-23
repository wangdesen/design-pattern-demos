package com.wangdesen.dp.facade;

/**
 * 子系统角色(电脑内存)
 * 
 * @author wangdesen
 * */
public class Memory implements Component{

	@Override
	public void startup() {
		System.out.println("Memory startup...");
	}

	@Override
	public void shutdown() {
		System.out.println("Memory shutdown...");
	}
}
