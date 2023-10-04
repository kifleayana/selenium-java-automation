package com.automation.test;

import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;
import com.java.selenium.pages.ButtonsPage;

public class ButtonsTest extends ActionEngine {
	ButtonsPage buttonsPage = new ButtonsPage();
	
	@Test
	public void validateDoubleClick() {
		
		buttonsPage.doubleClick();
	}
	
	@Test
	public void validateRightClick() {
		
		buttonsPage.contextClick();
	}

}
