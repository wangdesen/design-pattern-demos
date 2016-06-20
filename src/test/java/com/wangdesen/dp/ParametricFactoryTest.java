package com.wangdesen.dp;

import com.wangdesen.dp.factory.creator.ParametricShapeFactory;
import com.wangdesen.dp.factory.exception.NoThisShape;

/**
 * 参数化工厂
 * 
 * @author wangdesen
 * @version 1.0
 * */
public class ParametricFactoryTest {

	public static void main(String[] args) throws NoThisShape {
		ParametricShapeFactory.anOperation("Shape one","circle");
		ParametricShapeFactory.anOperation("Shape two","square");
		ParametricShapeFactory.anOperation("Shape three","delta");
	}

}
