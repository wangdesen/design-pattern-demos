package com.wangdesen.dp.factory.concreteproduct;

import com.wangdesen.dp.factory.product.Shape;

/**
 * 圆形子类
 * 
 * @author wangdesen
 * @version 1.0
 * */
public class Circle extends Shape {

	public Circle(String aName) {
		super(aName);
	}

	@Override
	public void draw() {
		System.out.println("It will draw a circle.");
	}

	@Override
	public void erase() {
		System.out.println("It will erase a circle.");
	}

}
