package com.wangdesen.dp.state;


/**
 * ConcreteState(无硬币状态)
 * 
 * @author wangdesen
 * */
public class NoQuarterState implements State {

	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("你投入了一个硬币！");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("你还没有投入硬币，就别想着退出硬币了！");
	}

	@Override
	public void turnCrank() {
		System.out.println("你还没有投入硬币，转动手柄也没有用！");
	}

	@Override
	public void dispense() {
		System.out.println("没有硬币，没有分配糖果！");
	}

}
