package com.automation.test;

import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;
import com.java.selenium.pages.WindowsPage;

public class WindowsTest extends ActionEngine {
	
	WindowsPage windowsPage = new WindowsPage();
	
	@Test
	public void validateHeading() throws Throwable {
		extentTest = extentReports.startTest("Script name", "Test case");
		windowsPage.clickNewTab();
		windowsPage.navigateToNewTab();
		windowsPage.validateHeadingText();
	}

}
