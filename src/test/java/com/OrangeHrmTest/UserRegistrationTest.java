package com.OrangeHrmTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHrmLibrary.UserPage;

public class UserRegistrationTest extends UserPage
{  @Parameters({"userrole","empname","username","password","confirmpassword"})
   @Test
   public void UserRegistration(String userrole, String empname, String username, String password,String confirmpassword)
   {
	   UserPage up = new UserPage();
	   up.UserRegistration(userrole, empname, username, password, confirmpassword);
	   
   }
}
