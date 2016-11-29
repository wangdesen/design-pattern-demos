package com.wangdesen.dp.iterator;

/**
 * 菜单项
 * 
 * @author wangdesen
 * */
public class MenuItem {
	
	/**
	 * 名称
	 */
	String name;
	
	/**
	 * 描述
	 */
	String description;
	
	/**
	 * 素食标记
	 */
	boolean vegetarian;

	/**
	 * 售价
	 */
	double price;
 
	/**
	 * 构造方法
	 * 
	 * @param name				名称
	 * @param description		描述
	 * @param vegetarian		素食标记
	 * @param price				售价
	 */
	public MenuItem(String name, String description, boolean vegetarian, double price){
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}
}
