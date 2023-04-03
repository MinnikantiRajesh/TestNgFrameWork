package com.OrangeHrmLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.UtilsPacakage.OrangeHrmUtils;

public class EmployeePage extends OrangeHrmUtils
{
   String EmpId;
   public void EmployeeRegistration(String fname, String mname, String lname)
   {
	   driver.findElement(By.linkText("PIM")).click();
	   driver.findElement(By.linkText("Add Employee")).click();
	   
	   driver.findElement(By.id("firstName")).sendKeys(fname);
	   driver.findElement(By.id("middleName")).sendKeys(mname);
	   driver.findElement(By.id("lastName")).sendKeys(mname);
	   EmpId = driver.findElement(By.id("employeeId")).getAttribute("value");
	   driver.findElement(By.id("btnSave")).click();
   }
   
   public boolean isEmployeeAdd()
   {
	   boolean flag = false;
	   //driver.findElement(By.linkText("PIM")).click();
	   driver.findElement(By.linkText("Employee List")).click();   
	   driver.findElement(By.id("empsearch_id")).sendKeys(EmpId);
	   driver.findElement(By.id("searchBtn")).click();
	   
	   WebElement resulttable =  driver.findElement(By.id("tableWrapper"));
	   List<WebElement> rows = resulttable.findElements(By.tagName("tr"));
	   for(int i=1; i<rows.size(); i++)
	   {
		   List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
		   
			  if(columns.get(1).getText().equals(EmpId))
			  {
				  System.out.println("Employee registered successfully");
				  flag = true;
				  break;
			  } 
		   
		  
		 }
	   
	   return flag;
	   
   }
}
