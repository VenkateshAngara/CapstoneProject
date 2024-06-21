package com.wipro.PagePOM;

import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.wipro.baseclass.BaseClass;
import com.wipro.utilities.screenshot;

public class Register extends BaseClass{
	
	public void Register(String fname,String lname,String day,String month,String year,String email,String pwd,String cpwd) throws IOException, InterruptedException 
	{
		
		//Locate the textfile with the path
		FileWriter file = new FileWriter(System.getProperty("user.dir")+"/src/test/resources/textfile/Register.txt");
		
		//to click the register button
		driver.findElement(By.xpath(prop2.getProperty("reg"))).click();
		
		//to click on the specified gender
		driver.findElement(By.xpath(prop2.getProperty("gen"))).click();
		
		//To get Details from excel sheet and enter details
		driver.findElement(By.xpath(prop2.getProperty("fname"))).sendKeys(fname);
		
		driver.findElement(By.xpath(prop2.getProperty("lname"))).sendKeys(lname);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop2.getProperty("lemail"))).sendKeys(email);
		
		driver.findElement(By.xpath(prop2.getProperty("pw"))).sendKeys(pwd);
		
		driver.findElement(By.xpath(prop2.getProperty("cpw"))).sendKeys(cpwd);
		
		//to click on the register button
		driver.findElement(By.xpath(prop2.getProperty("regbutton"))).click();
		
		//to get xpath of the result and store it in webelement e
		WebElement e= driver.findElement(By.xpath(prop2.getProperty("res")));
		String a=e.getText();
		file.write(a);
		file.close();
		
		//For screenshot
		screenshot s= new screenshot();
		s.ss(driver, "success");
		
	}

}
