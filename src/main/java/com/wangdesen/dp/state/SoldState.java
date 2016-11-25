package com.wangdesen.dp.state;


/**
 * 售出糖果状态
 * */
public class SoldState implements State {

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("请稍等，我们正在为你发放糖果ing...");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry，你已经转动手柄，糖果正在产生，无法为你退会糖果。");
	}

	@Override
	public void turnCrank() {
		System.out.println("糖果正在方法，本次转动手柄无效！");
	}

	@Override
	public void dispense() {
		gumballMachine.releasBall();
		//设置为无硬币状态
		if(gumballMachine.getCount() > 0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			System.out.println("预告：糖果机没有存货了！！！");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}

	}

}
