package com.java.selenium.pages;

import org.openqa.selenium.By;

import com.java.selenium.actions.ActionEngine;

public class TablePage extends ActionEngine{
	private By table = By.xpath("//div[@class='rt-table']");
	private By tableBody = By.xpath("//div[@class='rt-tbody']");
	private By tableRow = By.xpath("//div[@class='rt-tr-group']");
	private By tableData = By.xpath("//div[@class='rt-td']");
	
	public void printTableData() {
		tableData(table, tableBody,  tableRow, tableData);
	}

}
