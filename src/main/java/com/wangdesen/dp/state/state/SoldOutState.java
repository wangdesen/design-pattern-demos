package com.wangdesen.dp.state.state;

import com.wangdesen.dp.state.service.GumballMachine;

/**
 * 售罄状态
 * */
public class SoldOutState implements State {

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("别投币了，现在没有糖果！");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("没有糖果，没有硬币，什么也没有退出！");
	}

	@Override
	public void turnCrank() {
		System.out.println("没有糖果，正在等待工作人员火速支援...");
	}

	@Override
	public void dispense() {
		System.out.println("没有存货，发不出来糖果");
	}

}
