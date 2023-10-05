package com.automation.test;

import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;
import com.java.selenium.pages.IFramesPage;

public class IFramesTest extends ActionEngine {
	IFramesPage iFramesPage = new IFramesPage();
	
	@Test
	public void validateHeadingTest() {
		iFramesPage.validateHeaderMessage();
	}

}
