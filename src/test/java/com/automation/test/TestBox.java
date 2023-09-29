package com.automation.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;

public class TestBox extends ActionEngine{

	@Test
	public void submitAddress() throws Throwable {
		
		type(By.id("userName"), "Full Name", "Kifle Ayana");
		type(By.id("userEmail"), "Email", "kifle@kifle.com");
		type(By.id("currentAddress"), "Current Address", "MD, UAS, 23456");
		type(By.id("permanentAddress"), "Permanent Address", "MD, UAS, 23456");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pageScroll(By.id("submit"));
		click(By.id("submit"), "Submit button");
	}
	
	@Test
	public void valiodateAddress() {
		
		
		// validation part
	}
	
}
