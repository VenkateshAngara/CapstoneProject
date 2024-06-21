package com.wipro.PagePOM;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.wipro.baseclass.BaseClass;
import com.wipro.utilities.*;

public class Select extends BaseClass{
	public void select1() throws IOException {

		// to call the screenshot function
		screenshot s = new screenshot();

		// to click on select button
		driver.findElement(By.xpath(prop2.getProperty("pro"))).click();
		
		// to click on add to cart button
		driver.findElement(By.xpath(prop2.getProperty("cart"))).click();
		
		// to locate the text file with the path
		FileWriter f = new FileWriter(System.getProperty("user.dir")+"/src/test/resources/textfile/Price.txt");
		
		// to get xpath of the result and store it in webelement x
		WebElement x = driver.findElement(By.xpath(prop2.getProperty("pri")));
		
		// to get text from web element x
		String a = x.getText();
		
		// to get xpath of the result and store it in webelement w
		WebElement w = driver.findElement(By.xpath(prop2.getProperty("ven")));
		
		// to get text from web element w
		String b = w.getText();
		//to write the text in the text file
		f.write("The prize is :");
		f.write(a);
		f.write("\n");
		f.write(b);
		
		//to close the text file
		f.close();
		
		// to click on add to cart link button in the pop up message
		driver.findElement(By.xpath(prop2.getProperty("pcart"))).click();
		
		// to enable the agree check-box
		driver.findElement(By.xpath(prop2.getProperty("terms"))).click();
		
		//to click on checkout button
		driver.findElement(By.xpath(prop2.getProperty("ccheckout"))).click();
		
		//to click the continue button at Billing Address
		driver.findElement(By.xpath(prop2.getProperty("bill"))).click();
		
		//to click the continue button at Shipping method
		driver.findElement(By.xpath(prop2.getProperty("ship"))).click();
		
		//to click the continue button at Payment method
		driver.findElement(By.xpath(prop2.getProperty("pay"))).click();
		
		//to click the continue button at Payment information
		driver.findElement(By.xpath(prop2.getProperty("info"))).click();
		
		//to click on confirm button
		driver.findElement(By.xpath(prop2.getProperty("confirm"))).click();

		String n = "confirm";

		//to take screenshot of the page
		s.ss(driver, n);

	}

}
