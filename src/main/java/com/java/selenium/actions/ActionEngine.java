package com.java.selenium.actions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.java.selenium.base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class ActionEngine extends TestBase {
	
	public WebElement getWebElement(By locator) {
		WebElement we = driver.findElement(locator);
		return we;
		
	}

	public void click(By locator, String locatorName) throws Throwable {
		boolean flag = false;
		try {
			driver.findElement(locator).click();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				extentTest.log(LogStatus.PASS, "Successfully clicked on " + locatorName);
			} else {
				extentTest.log(LogStatus.FAIL,
						"Failed to click on " + locatorName + extentTest.addScreenCapture(getScreenshot(locatorName)));
			}

		}
	}

	public void type(By locator, String locatorName, String value) throws Throwable {
		driver.findElement(locator).sendKeys(value);
		System.out.println(value + " is enterded into " + locatorName + " successfully!");
	}

	public void pageScroll(By locator) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", locator);
		js.executeScript("window.scrollBy(0, 300)");
	}

	public void selectByVisibleText(By locator, String locatorName, String visibletest) throws Throwable {

		Select dropDown = new Select(driver.findElement(locator));
		dropDown.selectByVisibleText(visibletest);
		System.out.println(visibletest + " is selected from dropdown" + locatorName + " successfully!");

	}

	public void selectByIndex(By locator, String locatorName, int index) throws Throwable {

		Select dropDown = new Select(driver.findElement(locator));
		dropDown.selectByIndex(index);
		System.out.println(index + " based vlues is selected from dropdown" + locatorName + " successfully!");

	}

	public void selectByValue(By locator, String locatorName, String value) throws Throwable {

		Select dropDown = new Select(driver.findElement(locator));
		dropDown.selectByValue(value);
		System.out.println(value + " is selected from dropdown" + locatorName + " successfully!");

	}

	public void waitForElementToBeClickable(By locator, int waitTime) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}

	public void fluentWait(final By locator, int waitTime, int pollTime) throws Throwable {

		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(waitTime))
				.pollingEvery(Duration.ofSeconds(pollTime)).ignoring(WebDriverException.class);
		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);

			}
		});
	}

	public void acceptAlert() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}

	public void dismissAlert() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.dismiss();
	}

	public void sendDataTosAlert(String str) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.sendKeys(str);
	}

	public static String getScreenshot(String screenshotName) throws Throwable {
		String screenshotLocation = System.getProperty("user.dir");
		try {
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			screenshotLocation = screenshotLocation + File.separator + "FailedScreenShots" + File.separator
					+ screenshotName + dateName + ".png";
			File finalDestination = new File(screenshotLocation);
			FileUtils.copyFile(source, finalDestination);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return screenshotLocation;
	}

	public void doubleClick(By locator, String locatorname) {
		try {

			Actions actions = new Actions(driver);
			actions.doubleClick(driver.findElement(locator)).perform();
			
			actions.sendKeys(Keys.CONTROL);
			actions.sendKeys("a");
			actions.sendKeys(Keys.CONTROL);
			actions.sendKeys("c");
			actions.sendKeys(Keys.SPACE);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void contextClick(By locator, String locatorname) {
		try {
			// contextClick is nothing but right clicking
			Actions actions = new Actions(driver);
			actions.contextClick(driver.findElement(locator)).perform();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void switchToSecondWindow() {
		
		//String parentWindow = driver.getWindowHandle();
		ArrayList<String> windowsList = new ArrayList<String>(driver.getWindowHandles());
		if(windowsList.size() > 1) {
			driver.switchTo().window(windowsList.get(1));
		}
	}

}
