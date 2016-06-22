package com.wangdesen.dp;

import java.util.Arrays;

import org.junit.Test;

import com.wangdesen.dp.templatemethod.barista.Coffee;
import com.wangdesen.dp.templatemethod.barista.CoffeeWithHook;
import com.wangdesen.dp.templatemethod.barista.Tea;
import com.wangdesen.dp.templatemethod.barista.TeaWithHook;
import com.wangdesen.dp.templatemethod.sort.Duck;

/**
 * TemplateMethod Test Class
 * 
 * @author wangdesen
 * @version 2.0
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
	
	/**
	 * Duck display method
	 * */
	public static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
	
	/**
	 * Duck SortMethod which has used TemplateMethod
	 * */
	@Test
	public void DuckSort(){
		Duck[] ducks = { 
				new Duck("Daffy", 8), 
				new Duck("Dewey", 2),
				new Duck("Howard", 7),
				new Duck("Louie", 2),
				new Duck("Donald", 10), 
				new Duck("Huey", 2)
		};
		System.out.println("Before sorting:");
		display(ducks);

		Arrays.sort(ducks);
 
		System.out.println("\nAfter sorting:");
		display(ducks);
	}
}
