package com.wangdesen.dp;

import com.wangdesen.dp.iterator.DinerMenu;
import com.wangdesen.dp.iterator.PancakeHouseMenu;
import com.wangdesen.dp.iterator.Waitress;

/**
 * 迭代器模式测试类
 * 
 * @author wangdesen
 */
public class IteratorTest {

	public static void main(String[] args) {
		//蛋糕房菜单
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		//晚餐菜单
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
		waitress.printVegetarianMenu();

		System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Hotdog")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer asks, are the Waffles vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Waffles")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
