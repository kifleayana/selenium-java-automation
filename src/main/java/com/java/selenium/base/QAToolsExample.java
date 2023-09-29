package com.java.selenium.base;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.java.selenium.actions.ActionEngine;

public class QAToolsExample extends ActionEngine{
	
	@Test
	public void main() throws Throwable {
	
	//	String formsHeaderText = driver.findElement(By.xpath("//div[@class='main-header']")).getText();// follow this line and the "if " condition 
		//below if you want to validate anything on the web page.
		
	/*
	 * if(formsHeaderText.equals("Forms")) {
	 * System.out.println("Successfully navigated to the Forms page!"); }else {
	 * System.out.println("Failed to navigate to the Forms page!"); }
	 */
		click(By.xpath("//span[text()='Practice Form']"), "Practice Form Link");
		//driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		//System.out.println("Successfully Clicked on 'Practice Form link'");
		
		
		/*
		 * String practiceFormsHeaderText =
		 * driver.findElement(By.xpath("//div[@class='main-header']")).getText();
		 * 
		 * if(practiceFormsHeaderText.equals("Practice Form")) {
		 * System.out.println("Successfully navigated to the Practice Form page!");
		 * }else { System.out.println("Failed to navigate to the Practice Form page!");
		 * }
		 */
		
		type(By.id("firstName"), "First Name", "Kifle");
		type(By.xpath("//*[@id='lastName']"), "Last Name", "Mathew");
		type(By.xpath("//*[@id='userEmail']"), "User Email", "Mathew@google.com");
		click(By.xpath("//label[@for='gender-radio-1']"), "Gender");
		type(By.id("userNumber"), "Mobile number", "1234567890");
		
		
		driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("345 Greenary Rd,langston,SC,USA");
		System.out.println("Current address entered into the field successfully");
		
	}

}
