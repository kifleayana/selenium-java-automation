package com.automation.test;

import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;
import com.java.selenium.pages.TablePage;

public class TableTest extends ActionEngine {
	
	TablePage  tablePage = new TablePage();
	
	@Test
	public void printTableData() {
		tablePage.printTableData();
	}
}
