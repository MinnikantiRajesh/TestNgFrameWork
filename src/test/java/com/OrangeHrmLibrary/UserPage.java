package com.OrangeHrmLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.UtilsPacakage.OrangeHrmUtils;

public class UserPage extends OrangeHrmUtils
{
   public void UserRegistration(String userrole, String empname, String username,String password, String confirmpassword)
   {
	   driver.findElement(By.linkText("Admin")).click();
	   driver.findElement(By.linkText("User Management")).click();
	   driver.findElement(By.linkText("Users")).click();
	   driver.findElement(By.id("btnAdd")).click();
	   
	   Select select = new Select(driver.findElement(By.id("systemUser_userType")));
	   select.selectByVisibleText(userrole);
	   
	   driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
	   driver.findElement(By.id("systemUser_userName")).sendKeys(username);
	   driver.findElement(By.id("systemUser_password")).sendKeys(password);
	   driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(password);
	   driver.findElement(By.id("btnSave")).click();
	   
   }
   
   public void UserLogin(String uname, String password)
   {
	   driver.findElement(By.id("txtUsername")).sendKeys(uname);
	   driver.findElement(By.id("txtPassword")).sendKeys(password);
   }
}
