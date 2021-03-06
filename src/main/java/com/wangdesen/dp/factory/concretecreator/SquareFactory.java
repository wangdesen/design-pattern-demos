package com.wangdesen.dp.factory.concretecreator;

import com.wangdesen.dp.factory.concreteproduct.Square;
import com.wangdesen.dp.factory.creator.ShapeFactory;
import com.wangdesen.dp.factory.product.Shape;

/**
 * 定义返回Square实例的SquareFactory
 * 
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日14:58:46
 * */
public class SquareFactory extends ShapeFactory {
	
	@Override
	protected Shape factoryMethod(String aName) {
		return new Square(aName + "(created by SquareFactory)");
	}

}
