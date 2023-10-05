package com.java.selenium.pages;

import org.openqa.selenium.By;

import com.java.selenium.actions.ActionEngine;

public class IFramesPage extends ActionEngine{
	
	private By sampleHeading = By.xpath("//h1[@id='sampleHeading']");
	
	public void validateHeaderMessage() {
		String message="";
		
		try {
			switchToFrame("frame1");
			message = getWebElement(sampleHeading).getText();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(message.equals("This is a sample page")) {
			System.out.println("Validation passed");
		}else {
			System.out.println("Validation Failed");
		}
	}

}
