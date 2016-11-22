package com.wangdesen.dp;

import com.wangdesen.dp.bridge.Bus;
import com.wangdesen.dp.bridge.Car;
import com.wangdesen.dp.bridge.Engine;
import com.wangdesen.dp.bridge.Engine200;
import com.wangdesen.dp.bridge.Engine300;
import com.wangdesen.dp.bridge.Jeep;

/**
 * 桥接模式客户端
 * 
 * @author wangdesen
 * @date:2016-11-22 09:39:33
 * */
public class BridgeTest {

	public static void main(String[] args) {
		Engine engine200 = new Engine200();
		Engine engine300 = new Engine300();
		
		Car bus = new Bus(engine300);
		Car jeep = new Jeep(engine200);
		
		bus.installEngine();
		jeep.installEngine();
	}

}
