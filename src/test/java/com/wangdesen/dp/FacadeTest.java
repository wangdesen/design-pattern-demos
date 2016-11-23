package com.wangdesen.dp;

import com.wangdesen.dp.facade.Computer;

/**
 * 外观模式测试类
 * 
 * @author wangdesen
 * */
public class FacadeTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		System.out.println("\n");
		computer.shutdown();
	}

}
