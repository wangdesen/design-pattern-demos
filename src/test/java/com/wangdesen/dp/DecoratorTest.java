package com.wangdesen.dp;

import com.wangdesen.dp.decorator.starbuzz.beverage.Beverage;
import com.wangdesen.dp.decorator.starbuzz.beverage.DarkRoast;
import com.wangdesen.dp.decorator.starbuzz.beverage.Espresso;
import com.wangdesen.dp.decorator.starbuzz.beverage.HouseBlend;
import com.wangdesen.dp.decorator.starbuzz.condiment.Mocha;
import com.wangdesen.dp.decorator.starbuzz.condiment.Soy;
import com.wangdesen.dp.decorator.starbuzz.condiment.Whip;

/**
 * 装饰者模式测试类
 * 
 * @author wangdesen
 * */
public class DecoratorTest {
 
	public static void main(String args[]) {
		
		//浓咖啡，什么也不加
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		//焦糖咖啡，加两分摩卡，一份奶油
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		//综合咖啡，加豆浆，摩卡，奶油
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
	}
}
