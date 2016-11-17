package com.wangdesen.dp;

import com.wangdesen.dp.adapter.Adaptee;
import com.wangdesen.dp.adapter.ClassAdapter;
import com.wangdesen.dp.adapter.ObjectAdapter;
import com.wangdesen.dp.adapter.Target;

/**
 * 适配器测试
 * */
public class AdapterTest {

	public static void main(String[] args) {
		
		//对象适配器模式
		Adaptee adaptee = new Adaptee();
		Target objectTarget = new ObjectAdapter(adaptee);
		objectTarget.request();
		
		//类适配器模式
		Target classTarget = new ClassAdapter();
		classTarget.request();
		
	}

}
