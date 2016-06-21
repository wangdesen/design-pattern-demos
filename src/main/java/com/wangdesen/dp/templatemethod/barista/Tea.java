package com.wangdesen.dp.templatemethod.barista;

/**
 * 具体饮料--茶
 * 
 * 茶同咖啡一样，只需要重写【冲入】【添加调料】方法即可
 * 
 * @author wangdesen
 * @version 1.0
 * */
public class Tea extends CaffeineBeverage {
	public void brew() {
		System.out.println("Steeping the tea");
	}
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
