package com.wipro.PagePOM;

import org.openqa.selenium.By;
import com.wipro.baseclass.BaseClass;

public class Login extends BaseClass{
	
    public void LoginTest(String email, String password) throws InterruptedException {
    	
    	Thread.sleep(1500);
    	
    	//click on login button
        driver.findElement(By.xpath(prop2.getProperty("lin"))).click();
        
        //Get Details from excel
        driver.findElement(By.xpath(prop2.getProperty("lemail"))).sendKeys(email);
        
        driver.findElement(By.xpath(prop2.getProperty("lpw"))).sendKeys(password);
        
        //click on login button
        Thread.sleep(1500);
        
        driver.findElement(By.xpath(prop2.getProperty("button"))).click();
    }

}
