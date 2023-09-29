package com.automation.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;
public  class SelectMenuTest extends ActionEngine{
	
	@Test
	public void selectOldStyleSelectMenu() throws Throwable {
		selectByVisibleText(By.id("oldSelectMenu"), "Old Style Select Menu", "Green");
		selectByIndex(By.id("oldSelectMenu"), "Old Style Select Menu", 4);
		selectByValue(By.id("oldSelectMenu"), "Old Style Select Menu", "7");
	}
	
	//@Test
	public void selectOldStyleSelectMenuByIndex() throws Throwable {
		selectByIndex(By.id("oldSelectMenu"), "Old Style Select Menu", 4);
	}
	
	//@Test
	public void selectOldStyleSelectMenuByValue() throws Throwable {
		selectByValue(By.id("oldSelectMenu"), "Old Style Select Menu", "7");
	}
}

