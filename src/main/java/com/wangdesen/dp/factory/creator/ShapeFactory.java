package com.wangdesen.dp.factory.creator;

import com.wangdesen.dp.factory.product.Shape;

/**
 * 抽象工厂,anOperation调用factoryMethod创建一个对象,并对该对象进行一系列操作
 * 
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日14:50:42
 * */
public abstract class ShapeFactory {

	/**
	 * 构造一个抽象形状
	 * @param aName
	 * @return
	 */
	protected abstract Shape factoryMethod(String aName);
	
	/**
	 * Shape工厂开工
	 * 
	 * @param aName
	 */
	public void anOperation(String aName){
		Shape s= factoryMethod(aName);
		System.out.println("The current shape is: " + s.name);
	    s.draw();
	    s.erase();
	}
}
