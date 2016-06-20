package com.wangdesen.dp.state.service;

import com.wangdesen.dp.state.state.HasQuarterState;
import com.wangdesen.dp.state.state.NoQuarterState;
import com.wangdesen.dp.state.state.SoldOutState;
import com.wangdesen.dp.state.state.SoldState;
import com.wangdesen.dp.state.state.State;
import com.wangdesen.dp.state.state.WinnerState;

/**
 * 糖果机
 * 
 * @author wangdesen
 * @version 2.0
 * */
public class GumballMachine {
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	//2016年6月17日加入大赢家模式
	State winnerState;
	
	State state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		if(numberGumballs > 0){
			//初始化为没有硬币状态
			state = noQuarterState;
		}
	}
	
	//投入硬币
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	//退回硬币
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	//转动手柄
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	//发放糖果
	public void releasBall(){
		System.out.println("注意：一个糖果就要飞出来了！");
		if(count != 0){
			count = count - 1;
		}
	}

	public int getCount() {
		return count;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public State getState() {
		return state;
	}
	
}
