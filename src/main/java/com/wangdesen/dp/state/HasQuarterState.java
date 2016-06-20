package com.wangdesen.dp.state;

import java.util.Random;

/**
 * 有硬币状态
 * 
 * @author wangdesen
 * 
 * 2016年6月17日修改：加入大赢家模式
 * */
public class HasQuarterState implements State {

	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("糖果机里面已经有一个硬币了！");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("退出硬币");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("你转动了手柄...");
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && (gumballMachine.getCount() >1)){
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else{
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("没有分配糖果");
	}

}
