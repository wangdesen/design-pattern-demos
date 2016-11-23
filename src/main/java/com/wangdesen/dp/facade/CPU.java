package com.wangdesen.dp.facade;

/**
 * 子系统角色(CPU)
 * 
 * @author wangdesen
 * */
public class CPU implements Component {

	@Override
	public void startup() {
		System.out.println("CPU startup...");
	}

	@Override
	public void shutdown() {
		System.out.println("CPU shutdown...");
	}

}
