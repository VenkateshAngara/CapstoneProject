package com.wipro.PagePOM;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.wipro.baseclass.*;
import com.wipro.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MenuLinks extends BaseClass{
	
	public void menu() throws IOException {

		//syntax to call the screenshot function
		screenshot s = new screenshot();
		
		//to click on the computers link button
		driver.findElement(By.xpath(prop2.getProperty("computer"))).click();
		s.ss(driver, "computer");
		
		//to click on the electronics link button
		driver.findElement(By.xpath(prop2.getProperty("electro"))).click();
		s.ss(driver, "electronics");
		
		//to click on the Apparel link button
		driver.findElement(By.xpath(prop2.getProperty("appa"))).click();
		s.ss(driver, "apparel");
		
		//to click on the digital link button
		driver.findElement(By.xpath(prop2.getProperty("digital"))).click();
		s.ss(driver, "digital download");
		
		//to click on the book link button
		driver.findElement(By.xpath(prop2.getProperty("books"))).click();
		s.ss(driver, "book");
		
		//to click on the Jewelry link button
		driver.findElement(By.xpath(prop2.getProperty("jew"))).click();
		s.ss(driver, "jewelry");
		
		//to click on the gift link button
		driver.findElement(By.xpath(prop2.getProperty("gift"))).click();
		s.ss(driver, "gift card");

		// to locate the text file with the path
		FileWriter f = new FileWriter(System.getProperty("user.dir")+"/src/test/resources/textfile/Link.txt");
		
		// to get x path of the result and store it in web element x
		WebElement w = driver.findElement(By.xpath(prop2.getProperty("link")));
		
		List<WebElement> l = w.findElements(By.xpath(prop2.getProperty("menu")));
		
		int n = l.size();
		
		f.write("Total menus are :" + " " + n);
		
		f.write("\n");
		
		for (int i = 0; i < n; i++)

		{
			String r = l.get(i).getText();
			f.write(i + 1 + "," + " " + "menu is" + " " + r);
			f.write("\n");
		}

		//to close the text file
		f.close();

	}

}
