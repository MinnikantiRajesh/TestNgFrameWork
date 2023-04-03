package com.UtilsPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class OrangeHrmUtils 
{
	public static WebDriver driver;
	
	@BeforeSuite
	public static void LaunchApplication()
	{
		System.setProperty("Webdriver.chromedriver","C:\\java-projects\\Java Cocepts Practice\\TestNGFrameWork\\chromedriver.exe"); 
		  driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  
		  driver.get("http:www.orangehrm.qedgetech.com");
	}
	
	/*@AfterTest
    public void Logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	*/
	@AfterSuite
	public static void CloseApplication()
	{
		driver.close();
	}
}
