package com.wipro.cucumberTestcase;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wipro.baseclass.BaseClass;
import com.wipro.utilities.screenshot;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepData extends BaseClass {

	
	@Given("user open the url and is on login page")
	public void user_open_the_url_and_is_on_login_page() throws IOException {
		
		setUp();
	 
	}

	@When("user enters and clicks login")
	public void user_enters_and_clicks_login() {
		
		//click on login button
        driver.findElement(By.xpath(prop2.getProperty("lin"))).click();
        
        //Get Details from excel
        driver.findElement(By.xpath(prop2.getProperty("lemail"))).sendKeys("venkatesh444@gmail.com");
        
        driver.findElement(By.xpath(prop2.getProperty("lpw"))).sendKeys("Angara@123");
        
        //click on login button
        driver.findElement(By.xpath(prop2.getProperty("button"))).click();
	}

	@And("user click on menu links")
	public void user_click_on_menu_links() throws IOException {
		
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

	@Then("user click on logout")
	public void user_click_on_logout() {
		 
		driver.findElement(By.xpath(prop2.getProperty("logout"))).click();
		 
		 driver.close();
		
	}

}
