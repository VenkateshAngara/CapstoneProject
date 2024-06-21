package com.wipro.Testcases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import com.wipro.utilities.*;
import com.wipro.baseclass.BaseClass;
import com.wipro.PagePOM.*;



public class Testcase4 extends BaseClass{
	
	screenshot s = new screenshot();
	
	@Test(priority = 0, dataProvider = "logindata")

	public void Login1(String email, String password) throws InterruptedException, IOException {
		//to create an object to call the function
		Login l = new Login();
		
		//to call the function by using the object
		l.LoginTest(email, password);
	}

	@Test
	@DataProvider(name = "logindata")

	public Object[][] testdata2() throws EncryptedDocumentException, IOException {
		//to pass the sheet name given in excel sheet
		String excelSheetName = "Login";
		
		//to store the value from the excel sheet
		Object[][] data = ReadData.getData(excelSheetName);
		
		//to return the stored data
		return data;
	}

	@Test(priority = 1)

	public void mymenu() throws IOException {
		
		//to create an object to call the function
		MenuLinks m = new MenuLinks();
		
		//to call the function
		m.menu();
	}

	@Test(priority = 3)

	public void logout1() throws IOException {
		
		//to create an object to call the function
		Logout l = new Logout();
		
		//to call the function
		l.logoutTest();
		
		//syntax for screenshot
		String n = "logout2";
		
		s.ss(driver, n);

	}

}
