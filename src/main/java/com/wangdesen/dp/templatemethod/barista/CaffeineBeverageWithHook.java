package com.wangdesen.dp.templatemethod.barista;

/**
 * 带钩子的咖啡因类饮料
 * 
 * @author wangdesen
 * @version 2.0
 * */
public abstract class CaffeineBeverageWithHook {
 
	/**
	 * 准备步骤--使用了钩子
	 * */
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
 
	//冲入
	abstract void brew();
 
	//添加调料
	abstract void addCondiments();
 
	//开水
	void boilWater() {
		System.out.println("Boiling water");
	}
 
	//倒入杯子
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	/**
	 * 客户是否要加调料
	 * 
	 * 这是一个钩子，子类可以选择实现钩子，也可以不做
	 * 
	 * 做钩子的一般目的，就是为了在子类中灵活处理
	 * */
	boolean customerWantsCondiments() {
		return true;
	}
}
