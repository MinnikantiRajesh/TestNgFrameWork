package com.OrangeHrmTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHrmLibrary.EmployeePage;
import com.UtilsPacakage.OrangeHrmUtils;

public class EmployeeTest extends OrangeHrmUtils
{
	@Parameters({"fname","mname","lname"})
	@Test
	public void EmployeeRegistrartion(String fname, String mname, String lname)
	{
		EmployeePage Emp = new EmployeePage();
		Emp.EmployeeRegistration(fname,mname,lname);
		boolean result = Emp.isEmployeeAdd();
		Assert.assertTrue(result);
	}
    
}
