package com.java.selenium.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;

public class AlertsPages extends ActionEngine{

	private By alert=  By.id("alertButton");
	private By delayAlert = By.id("timerAlertButton");
	private By dismissAlert = By.id("confirmButton");
	private By promtButton = By.id("promtButton");
	
	// "Kifle"
	
	public void handleWithAlert() throws Throwable {
		click(alert, " Alert Button click");
		//acceptAlert();
	}
	
	public void handleWithDelayAlert() throws Throwable {
		click(delayAlert, "Handle With Delay Alert");
		acceptAlert();
	}
	
	public void dismissAlert() throws Throwable {
		click(dismissAlert, "Handle With Dismiss Alert");
		dismissAlert();
	}
	
	public void promptBoxTest() throws Throwable {
		click(promtButton, "Promt Button");
		String msg = "Kifle testing";
		sendDataTosAlert(msg);
		acceptAlert();
	}
}
