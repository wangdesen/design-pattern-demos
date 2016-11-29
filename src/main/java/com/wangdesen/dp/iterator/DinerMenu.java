package com.wangdesen.dp.iterator;

import java.util.Iterator;

/**
 * 晚餐菜单[采用Array存储菜单项]
 * 
 * @author wangdesen
 * */
public class DinerMenu implements Menu {
	
	/**
	 * 限制最大菜单项数量
	 */
	static final int MAX_ITEMS = 6;
	
	/**
	 * 菜单项数量
	 */
	int numberOfItems = 0;
	
	/**
	 * 晚餐菜单使用Array
	 */
	MenuItem[] menuItems;

	/**
	 * 无参构造方法
	 */
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
		addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
	}

	/**
	 * 添加菜单项[下标方式]
	 * 
	 * @param name
	 * @param description
	 * @param vegetarian
	 * @param price
	 */
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	/**
	 * 获取菜单项
	 * 
	 * @return
	 */
	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	/**
	 * 创建晚餐菜单迭代器
	 */
	public Iterator<?> createIterator() {
		return new DinerMenuIterator(menuItems);
		// return new AlternatingDinerMenuIterator(menuItems);
	}

	// other menu methods here
}
