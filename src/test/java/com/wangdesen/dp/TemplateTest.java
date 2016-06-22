package com.wangdesen.dp;

import org.junit.Test;

import com.wangdesen.dp.templatemethod.barista.Coffee;
import com.wangdesen.dp.templatemethod.barista.CoffeeWithHook;
import com.wangdesen.dp.templatemethod.barista.Tea;
import com.wangdesen.dp.templatemethod.barista.TeaWithHook;

/**
 * TemplateMethod Test Class
 * 
 * @author wangdesen
 * @version 1.0
 * */
public class TemplateTest {

	/**
	 * barista template method test with no hook
	 * */
	@Test
	public void CaffeineBeverageTest(){
		
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
	}
	
	/**
	 * barista template method test with no hook
	 * */
	@Test
	public void CaffeineBeverageWithHookTest(){
		
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
