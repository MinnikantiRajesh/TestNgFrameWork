package com.OrangeHrmTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHrmLibrary.LoginPage;

public class AdminLoginTestWithInvalidData 
{
	   @Parameters({"username","password"})
	   @Test(enabled = false)
	   public void AdminLoginWithInValidData(String username, String password)
	   {
		   LoginPage lp = new LoginPage();
		   lp.AdminLogin(username, password);
		   
		   boolean result = lp.isErrorMessageDisplayed();
		   Assert.assertTrue(result);
	   }
}
