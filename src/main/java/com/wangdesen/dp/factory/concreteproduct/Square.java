package com.wangdesen.dp.factory.concreteproduct;

import com.wangdesen.dp.factory.product.Shape;

/**
 * 方形子类
 * 
 * @author wangdesen
 * */
public class Square extends Shape {

	public Square(String aName) {
		super(aName);
	}

	@Override
	public void draw() {
		System.out.println("It will draw a square.");
	}

	@Override
	public void erase() {
		System.out.println("It will erase a square.");
	}

}
