package com.wangdesen.dp.state.state;

import com.wangdesen.dp.state.service.GumballMachine;

/**
 * 大赢家模式
 * 
 * @author wangdesen
 * */
public class WinnerState implements State {
	
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("大赢家模式不接受投币！");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("大赢家模式不接受退币！");
	}

	@Override
	public void turnCrank() {
		System.out.println("大赢家模式不接受转动手柄！");
	}

	@Override
	public void dispense() {
		System.out.println("恭喜恭喜！你获得了额外赠送的一颗糖果！");
		gumballMachine.releasBall();
		if(gumballMachine.getCount() == 0){
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else{
			gumballMachine.releasBall();
			if(gumballMachine.getCount() > 0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else{
				System.out.println("糖果机缺货了！");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
