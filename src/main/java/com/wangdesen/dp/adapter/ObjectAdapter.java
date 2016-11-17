package com.wangdesen.dp.adapter;

/**
 * 对象适配器
 * 
 * 适配器类实现了目标抽象类并定义了适配者类的实例，并在目标抽象类的实现方法中调用适配者相应业务方法
 * */
public class ObjectAdapter implements Target {

	private Adaptee adaptee;
	
	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
