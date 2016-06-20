package com.wangdesen.dp.factory.creator;

import com.wangdesen.dp.factory.concreteproduct.Circle;
import com.wangdesen.dp.factory.concreteproduct.Square;
import com.wangdesen.dp.factory.exception.NoThisShape;
import com.wangdesen.dp.factory.product.Shape;

/**
 * 参数化的工厂，由ParametricShapeFactory直接创建实例，
 * 直接用参数化的方法实现factorMethod返回多种对象
 * 
 * @author wangdesen
 * @version 2.0
 * @更新时间：2015年12月10日16:31:04
 * */
public abstract class ParametricShapeFactory {
	
	private static Shape s ;
	
	private ParametricShapeFactory(){}
	
	//product创建器
	static Shape factoryMethod(String aName, String aType) throws NoThisShape{
		if(aType.compareTo("square") == 0){
			return new Square(aName);
		}else if(aType.compareTo("circle") == 0){
			return new Circle(aName);
		}else{
			throw new NoThisShape(aType);
		}
	}
	
	//在anOperation中定义Shape的一系列行为
	public static void anOperation(String aName, String aType) throws NoThisShape{
		s= factoryMethod(aName, aType);
		System.out.println("The current shape is: " + s.name);
	    s.draw();
	    s.erase();
	}
}
