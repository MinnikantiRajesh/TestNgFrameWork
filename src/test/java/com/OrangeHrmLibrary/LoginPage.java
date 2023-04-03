package com.OrangeHrmLibrary;

import org.openqa.selenium.By;
import com.UtilsPacakage.OrangeHrmUtils;

public class LoginPage extends OrangeHrmUtils
{
  
  public void AdminLogin(String username, String password)
  {
	  driver.findElement(By.id("txtUsername")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("btnLogin")).click();
  }
  
  
  public boolean isAdminModuledisplayed()
  {
	  if(driver.findElement(By.linkText("Admin")).isDisplayed())
	  {
		  System.out.println("Admin Successfully Loggedin");
		  return true;
	  }
	  else
	  {
		  System.out.println("Admin Login Fail");
		  return false;
	  }
  }
  
  public boolean isErrorMessageDisplayed()
  {
	  String ErrorMsg = driver.findElement(By.id("spanMessage")).getText();
	  if(ErrorMsg.toLowerCase().contains("invalid"))
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
	  
  }
}
