package com.wangdesen.dp;

import com.wangdesen.dp.state.service.GumballMachine;

/**
 * 糖果机测试
 * 
 * @author wangdesen
 * @version 2.0
 * */
public class StateTest {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
	}

}
