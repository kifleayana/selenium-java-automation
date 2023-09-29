package com.automation.test;

import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;
import com.java.selenium.pages.AlertsPages;

public class AlertsTest extends ActionEngine{
	
	AlertsPages alertsPages = new AlertsPages();
	
	//@Test
	public void acceptAlert() throws Throwable {
		extentTest = extentReports.startTest("Script name", "Test case");
		alertsPages.handleWithAlert();
	}
	
	@Test
	public void handleWithDelayAlert() throws Throwable {
		extentTest = extentReports.startTest("handleWithDelayAlert", "Test case1");
		alertsPages.handleWithDelayAlert();
	}
	
	@Test
	public void handleWithDelayAlert2() throws Throwable {
		extentTest = extentReports.startTest("handleWithDelayAlert2", "Test case2");
		alertsPages.handleWithDelayAlert();
	}
	
	//@Test
	public void dismissAlert() throws Throwable {
		alertsPages.dismissAlert();
	}
	
	//@Test
	public void promptBoxTest() throws Throwable {
		extentTest = extentReports.startTest("Script name", "Test case");
		alertsPages.promptBoxTest();
	}
}