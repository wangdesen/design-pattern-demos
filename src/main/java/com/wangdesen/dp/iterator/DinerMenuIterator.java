package com.wangdesen.dp.iterator;
 
import java.util.Iterator;

/**
 * 晚餐菜单迭代器
 * 
 * @author wangdesen
 * */
public class DinerMenuIterator implements Iterator {
	
	/**
	 * 菜单项列表
	 */
	MenuItem[] list;
	
	/**
	 * 定位位置
	 */
	int position = 0;
 
	/**
	 * 构造方法
	 * 
	 * @param list
	 */
	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}
 
	/**
	 * 获取下一个菜单项
	 */
	public Object next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
 
	/**
	 * 是否还有下一项菜单
	 */
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
  
	/**
	 * 移除一个菜单项[最后一个位置]
	 */
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}
