package com.wangdesen.dp.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 蛋糕房菜单[采用List存储菜单项]
 * Ps:ArrayList自带迭代器
 * 
 * @author wangdesen
 * */
public class PancakeHouseMenu implements Menu {
	
	/**
	 * 菜单项列表
	 */
	ArrayList<MenuItem> menuItems;

	/**
	 * 构造方法
	 */
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries, and blueberry syrup", true, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
	}

	/**
	 * 增加菜单项[add方式]
	 * 
	 * @param name
	 * @param description
	 * @param vegetarian
	 * @param price
	 */
	public void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	/**
	 * 获取菜单项
	 * 
	 * @return
	 */
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	/**
	 * 创造菜单项迭代器
	 */
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}

	// other menu methods here
}
