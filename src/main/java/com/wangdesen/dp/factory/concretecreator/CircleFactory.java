package com.wangdesen.dp.factory.concretecreator;

import com.wangdesen.dp.factory.concreteproduct.Circle;
import com.wangdesen.dp.factory.creator.ShapeFactory;
import com.wangdesen.dp.factory.product.Shape;

/**
 * 定义返回 circle 实例的 CircleFactory
 * 
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日14:56:41
 * */
public class CircleFactory extends ShapeFactory {

	@Override
	protected Shape factoryMethod(String aName) {
		return new Circle(aName + " (created by CircleFactory)");
	}

}
