package com.wipro.PagePOM;
import java.io.IOException;
import org.openqa.selenium.By;
import com.wipro.baseclass.BaseClass;
import com.wipro.utilities.*;

public class Menu extends BaseClass{

	public void menu1() throws IOException {

		//to call the screenshot function
		screenshot s = new screenshot();

		String a = "login";
		
		//to take screenshot
		s.ss(driver, a);
		
		driver.findElement(By.xpath(prop2.getProperty("computer"))).click();
		
		driver.findElement(By.xpath(prop2.getProperty("desk"))).click();
		
		String n = "desktop";
		
		s.ss(driver, n);

	}

}
