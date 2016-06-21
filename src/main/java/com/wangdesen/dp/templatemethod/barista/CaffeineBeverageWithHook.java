package com.wangdesen.dp.templatemethod.barista;

/**
 * 带钩子的咖啡因类饮料
 * 
 * @author wangdesen
 * @version 2.0
 * */
public abstract class CaffeineBeverageWithHook {
 
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
 
	abstract void brew();
 
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
 
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	//客户是否要加调料
	boolean customerWantsCondiments() {
		return true;
	}
}
