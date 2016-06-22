package com.wangdesen.dp.templatemethod.barista;

/**
 * 抽象类-咖啡因类饮料
 * 
 * @author wangdesen
 * @version 1.0
 * */
public abstract class CaffeineBeverage {
  
	//冲调步骤
	public final void prepareRecipe() {
		boilWater();//开水
		brew();//冲入
		pourInCup();//倒入杯子
		addCondiments();//添加调料
	}
 
	abstract void brew();
  
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
  
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
