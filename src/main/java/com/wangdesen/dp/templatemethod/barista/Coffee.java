package com.wangdesen.dp.templatemethod.barista;

/**
 * 具体饮料--咖啡
 * 
 * 咖啡继承咖啡因类饮料，只需要重写【冲入】，【添加调料】两个方法即可
 * 
 * @author wangdesen
 * @version 1.0
 * */
public class Coffee extends CaffeineBeverage {
	
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
