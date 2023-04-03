package com.OrangeHrmTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHrmLibrary.LoginPage;
import com.UtilsPacakage.OrangeHrmUtils;

public class AdminLoginTestWithValidData extends OrangeHrmUtils
{
   @Parameters({"username","password"})
   @Test
   public void AdminLoginWithValidData(String username, String password)
   {
	   LoginPage lp = new LoginPage();
	   lp.AdminLogin(username, password);
	   boolean result = lp.isAdminModuledisplayed();
	   Assert.assertTrue(result);
	   
   }
    
}
