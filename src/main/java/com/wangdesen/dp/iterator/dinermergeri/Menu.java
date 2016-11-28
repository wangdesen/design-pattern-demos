package com.wangdesen.dp.iterator.dinermergeri;

import java.util.Iterator;

/**
 * 抽象菜单
 * 
 * @author wangdesen
 * */
public interface Menu {
	
	/**
	 * 创建迭代器
	 * */
	public Iterator createIterator();
}
