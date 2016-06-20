package com.wangdesen.dp;

import com.wangdesen.dp.factory.concretecreator.CircleFactory;
import com.wangdesen.dp.factory.concretecreator.SquareFactory;
import com.wangdesen.dp.factory.creator.ShapeFactory;

/**
 * 工厂模式测试类
 * 
 * @author wangdesen
 * @version 1.0
 * */
public class FactoryTest {

	public static void main(String[] args) {
		ShapeFactory sf1 = new CircleFactory();//圆形工厂
		ShapeFactory sf2 = new SquareFactory();//方形工厂
		
		sf1.anOperation("Shape one");
		sf2.anOperation("Shape two");
	}

}
