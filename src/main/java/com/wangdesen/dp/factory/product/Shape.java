package com.wangdesen.dp.factory.product;

/**
 * shape抽象类
 * 
 * @author wangdesen
 * @version 1.0
 * */
public abstract class Shape {
	
	//勾画shape
	public abstract void draw();
	
	//擦出shape
	public abstract void erase();
	
	public String name;

	public Shape(String aName) {
		name = aName;
	}
}
