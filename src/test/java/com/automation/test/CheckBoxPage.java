package com.automation.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;

public class CheckBoxPage extends ActionEngine {

	private By homeToggle = By.xpath("//li/span/button");
	private By desktopChecbox = By.xpath("(//input[@id='tree-node-desktop']/following-sibling::span)[1]");
	private By documentsToggle = By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/button");
	private By workspaceChecbox =By.xpath("//*[@id=\'tree-node\']/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]") ;
	
	@Test
	public void clickDesktopChecbox() throws Throwable {
		click(homeToggle, "Home Toggle");
		click(desktopChecbox, "Desktop Checbox");
	}
	@Test
	public void documentWorkspaceChecbox() throws Throwable {
		click(homeToggle, "Home Toggle");
		click(documentsToggle, "Documents Toggle");
		click(workspaceChecbox, "Workspace Checbox");
	}
















}
