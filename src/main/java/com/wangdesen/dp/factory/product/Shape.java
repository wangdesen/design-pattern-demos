package com.wangdesen.dp.factory.product;

/**
 * shape抽象类
 * 
 * @author wangdesen
 * @version 1.0
 * */
public abstract class Shape {
	
	/**
	 * 名称
	 */
	public String name;

	/**
	 * 有参构造方法
	 * 
	 * @param aName
	 */
	public Shape(String aName) {
		name = aName;
	}
	
	/**
	 * 勾画shape
	 */
	public abstract void draw();
	
	/**
	 * 擦除shape
	 */
	public abstract void erase();
	
	
}
