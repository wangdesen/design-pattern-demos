package com.wangdesen.dp.factory.exception;

/**
 * 无此形状异常
 * 
 * @author wangdesen
 * */
@SuppressWarnings("serial")
public class NoThisShape extends Exception {
	
	public NoThisShape(String aName){
		super(aName);
	}
}
