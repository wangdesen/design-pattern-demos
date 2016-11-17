package com.wangdesen.dp.adapter;

/**
 * 适配器
 * */
public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
