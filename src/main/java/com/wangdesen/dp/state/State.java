package com.wangdesen.dp.state;

/**
 * State(抽象状态类)
 * 
 * @author wangdesen
 * */
public interface State {

	/**
	 * 投入硬币
	 */
	public void insertQuarter();
	
	/**
	 * 退出硬币
	 */
	public void ejectQuarter();
	
	/**
	 * 转动手柄
	 */
	public void turnCrank();
	
	/**
	 * 发放糖果
	 */
	public void dispense();
}
