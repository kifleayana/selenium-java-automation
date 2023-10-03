package com.automation.test;

import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;
import com.java.selenium.pages.ButtonsPage;

public class ButtonsTest extends ActionEngine {
	
	@Test
	public void validateDoubleClick() {
		
		ButtonsPage buttonsPage = new ButtonsPage();
		buttonsPage.doubleClick();
	}
	
	@Test
	public void validateRightClick() {
		
		ButtonsPage buttonsPage = new ButtonsPage();
		buttonsPage.contextClick();
	}

}
