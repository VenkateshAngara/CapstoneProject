package com.wipro.PagePOM;

import java.io.IOException;

import org.openqa.selenium.By;

import com.wipro.baseclass.BaseClass;
import com.wipro.utilities.*;

public class Address extends BaseClass{
	
	public void address1(String fname, String lname, String email, String country, String city, String address,String pin, String phone) throws IOException 
	{

		//syntax to call the screenshot function
		screenshot s=new screenshot();

		//to click on the add address button
		driver.findElement(By.xpath(prop2.getProperty("addnew"))).click();
		
		//to click on the new button to add the address
		driver.findElement(By.xpath(prop2.getProperty("caddnew"))).click();
		
		//To get Details from excel sheet and enter Details
		driver.findElement(By.xpath(prop2.getProperty("addfname"))).sendKeys(fname);
		
		driver.findElement(By.xpath(prop2.getProperty("addlname"))).sendKeys(lname);
		
		driver.findElement(By.xpath(prop2.getProperty("addemail"))).sendKeys(email);
		
		driver.findElement(By.xpath(prop2.getProperty("addcountry"))).sendKeys(country);
		
		driver.findElement(By.xpath(prop2.getProperty("addcity"))).sendKeys(city);
		
		driver.findElement(By.xpath(prop2.getProperty("addadd"))).sendKeys(address);
		
		driver.findElement(By.xpath(prop2.getProperty("addzipcode"))).sendKeys(pin);
		
		driver.findElement(By.xpath(prop2.getProperty("addphone"))).sendKeys(phone);

		//to click on save button
		driver.findElement(By.xpath(prop2.getProperty("addsave"))).click();
		
		//to close the popup
		driver.findElement(By.xpath(prop2.getProperty("close"))).click();
		
		//to take screenshot
		s.ss(driver, "address1");

	}

}
