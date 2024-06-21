package com.wipro.PagePOM;

import org.openqa.selenium.By;
import com.wipro.baseclass.BaseClass;

public class MyAccount extends BaseClass{

	 public void myacnt() {
		
		 //to click the my account link button
		 driver.findElement(By.xpath(prop2.getProperty("myaccb"))).click();

	}

}
