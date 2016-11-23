package com.wangdesen.dp.facade;

/**
 * 外观角色(computer)
 * 
 * @author wangdesen
 * */
public class Computer {

	private Component memory;
	private Component cpu;
	
	public Computer() {
		memory = new Memory();
		cpu = new CPU();
	}
	
	/**
	 * 电脑启动
	 * */
	public void startup(){
		System.out.println("start computer...");
		memory.startup();
		cpu.startup();
		System.out.println("conputer start done!");
	}
	
	/**
	 * 电脑关停
	 * */
	public void shutdown(){
		System.out.println("shutdown computer...");
		memory.shutdown();
		cpu.shutdown();
		System.out.println("computer close finished!");
	}
	
}
