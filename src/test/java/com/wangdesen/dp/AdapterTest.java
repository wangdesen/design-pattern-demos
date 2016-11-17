package com.wangdesen.dp;

import com.wangdesen.dp.adapter.Adaptee;
import com.wangdesen.dp.adapter.Adapter;
import com.wangdesen.dp.adapter.Target;

/**
 * 适配器测试
 * */
public class AdapterTest {

	public static void main(String[] args) {
		
		//适配者
		Adaptee adaptee = new Adaptee();
		//目标
		Target target = new Adapter(adaptee);
		//目标相应
		target.request();
		
	}

}
