package com.wangdesen.dp.adapter;

/**
 * 类适配器
 * 
 * 适配器实现了目标抽象类接口并继承了适配者类，并在目标抽象类的实现方法中调用所继承的适配者的相应业务方法
 * */
public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void request() {
		this.specificRequest();
	}

}
