package com.java.selenium.pages;

import org.openqa.selenium.By;

import com.java.selenium.actions.ActionEngine;

public class WindowsPage extends ActionEngine {
	private By newTab = By.id("tabButton");
	private By headingText = By.id("sampleHeading");
	
	
	public void clickNewTab() throws Throwable {
		click(newTab, "New tab Button");
	}
	
	public void navigateToNewTab() {
		switchToSecondWindow();
	}
	
	public void validateHeadingText() {
		String text = getWebElement(headingText).getText();
		System.out.println("Text from Locator:: "+text);
		if (text.equals("This is a sample page")) {
			System.out.println("Test Case Passed!!");
		}else {
			System.out.println("Test Case Failed!!");
		}
	}

}
