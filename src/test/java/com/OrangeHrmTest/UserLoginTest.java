package com.OrangeHrmTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHrmLibrary.UserPage;
import com.UtilsPacakage.OrangeHrmUtils;

public class UserLoginTest extends OrangeHrmUtils
{
   @Parameters({"username","password"})
   @Test
   public void UserLogin(String username, String password)
   {
	   UserPage ul= new UserPage();
	   ul.UserLogin(username, password);
   }
}
