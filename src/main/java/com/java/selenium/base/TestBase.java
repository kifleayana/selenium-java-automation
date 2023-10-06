package com.java.selenium.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.awt.Desktop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
	public static WebDriver driver;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public String startDate;
	public String reportFilePath;
	
	@BeforeSuite
	public void beforeAll() throws Throwable {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM_dd_yyyy_z_HH_mm_ss");
		startDate = sdf.format(new Date());
		reportFilePath = System.getProperty("user.dir")+File.separator+"Reports"+File.separator+"reports_"+startDate+".html";
		extentReports = new ExtentReports(reportFilePath);
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setup(	String driverType) throws Throwable {

		System.out.println("Print driverType:: "+driverType);
		
		if ("chrome".equals(driverType)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if("ie".equals(driverType)) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if("firefox".equals(driverType)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if("edge".equals(driverType)) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//.get(LoadProps.getData("url"));
		//driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Kifle");
		//driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Kifle@kifle.com");
		//driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("MD, UAS");
		
		//driver.findElement(By.id("permanentAddress")).sendKeys("MD, UAS");
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.get("https://demoqa.com/webtables");
		//driver.findElement(By.id("id='userName'")).sendKeys("kifle");
		//driver.findElement(By.id("id='userEmail'")).sendKeys("Kifle@kifle");
		//driver.findElement(By.id("id='currentAddress'")).sendKeys("147 Kentucky st.,Upper Marlboro,21980,MD,USA");
		//driver.findElement(By.id("button@id='submit'")).click();
		//driver.findElement(By.id("firstName")).sendKeys("Edward");
//		driver.findElement(By.id("firstName")).sendKeys("John");
//		
//		driver.findElement(By.id("lastName")).sendKeys("Edwards");
//		driver.findElement(By.id("userEmail")).sendKeys("John@google.com");
//		driver.findElement(By.id("gender-radio-1")).click();
		
		// driver.close();
	}
	
	@AfterMethod
	public void rearDown() throws Throwable{
		//driver.close();
		extentReports.flush();
	}
	/**
	 * This method open the Extent report generated in a default browser after suite
	 * execution completed.
	 * 
	 */
	@AfterSuite
	public void SuiteClose() {
		File file = new File(reportFilePath);
		Desktop desktop = Desktop.getDesktop();
		try {
			desktop.browse(file.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	}


