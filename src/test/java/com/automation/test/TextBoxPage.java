package com.automation.test;

import org.openqa.selenium.By;

import com.java.selenium.actions.ActionEngine;

public class TextBoxPage extends ActionEngine{
	private By userNameText = By.id("userName");
	private By userEmailText = By.id("userEmail");
	private By currentAddressText = By.id("currentAddress");
	private By permanetAddressText = By.id("permanentAddress");
	private By submitButton = By.id("submit");
	
	public void submitAddress() throws Throwable{
		type(userNameText, "Full Name", "Kifle Ayana");
		type(userEmailText, "Email", "kifle@kifle.com");
		type(currentAddressText, "Current Address", "MD, UAS, 23456");
		type(permanetAddressText, "Permanent Address", "MD, UAS, 23456");
		//pageScroll(By.id("submit"));
		click(submitButton, "Submit button");
	}
	
	public void validateAddress() {
		
	}
}
