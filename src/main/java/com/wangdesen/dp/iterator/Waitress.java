package com.wangdesen.dp.iterator;

import java.util.Iterator;

/**
 * 对象村餐厅侍者
 * 
 * @author wangdesen
 * */
public class Waitress {
	
	/**
	 * 蛋糕房菜单
	 */
	Menu pancakeHouseMenu;
	
	/**
	 * 晚餐菜单
	 */
	Menu dinerMenu;
 
	/**
	 * 构造方法[拥有两项菜单]
	 * 
	 * @param pancakeHouseMenu
	 * @param dinerMenu
	 */
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
 
	/**
	 * 展示菜单
	 */
	public void printMenu() {
		Iterator<?> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<?> dinerIterator = dinerMenu.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
	}
 
	/**
	 * 迭代器方式遍历菜单
	 * 
	 * @param iterator
	 */
	private void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
 
	/**
	 * 提供素食菜单服务
	 */
	public void printVegetarianMenu() {
		System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
		printVegetarianMenu(pancakeHouseMenu.createIterator());
		System.out.println("\nLUNCH");
		printVegetarianMenu(dinerMenu.createIterator());
	}
 
	/**
	 * 提供是否为素食的问询服务
	 * 
	 * @param name
	 * @return
	 */
	public boolean isItemVegetarian(String name) {
		Iterator<?> pancakeIterator = pancakeHouseMenu.createIterator();
		if (isVegetarian(name, pancakeIterator)) {
			return true;
		}
		Iterator<?> dinerIterator = dinerMenu.createIterator();
		if (isVegetarian(name, dinerIterator)) {
			return true;
		}
		return false;
	}


	/**
	 * 在一个菜单遍历器中打印素食菜单
	 * 
	 * @param iterator
	 */
	private void printVegetarianMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.isVegetarian()) {
				System.out.print(menuItem.getName());
				System.out.println("\t\t" + menuItem.getPrice());
				System.out.println("\t" + menuItem.getDescription());
			}
		}
	}

	/**
	 * 判断一个菜单迭代器中的一个菜单项是否为素食
	 * 
	 * @param name
	 * @param iterator
	 * @return
	 */
	private boolean isVegetarian(String name, Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}
}
