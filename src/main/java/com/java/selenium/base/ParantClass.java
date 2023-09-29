package com.java.selenium.base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ParantClass {
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setup(String browsername) {
		System.out.println("Browsername:: "+browsername);
		System.out.println("I'm in setup() method");
	}
	
}
