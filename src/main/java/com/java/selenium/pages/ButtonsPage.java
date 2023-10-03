package com.java.selenium.pages;

import org.openqa.selenium.By;

import com.java.selenium.actions.ActionEngine;

public class ButtonsPage extends ActionEngine{
	
	private By doubleClick = By.id("doubleClickBtn");
	private By rightClick = By.id("rightClickBtn");
	
	public void doubleClick() {
		doubleClick(doubleClick, "Double Click Button");
	}
	
	public void contextClick() {
		contextClick(rightClick, "Right Click Button");
	}

}
