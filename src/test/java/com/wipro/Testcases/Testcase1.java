package com.wipro.Testcases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import com.wipro.baseclass.BaseClass;
import com.wipro.utilities.ReadData;
import com.wipro.PagePOM.*;


public class Testcase1 extends BaseClass{
	
	@Test(priority = 0, dataProvider = "registerdata")
	public static void Register1(String firstname, String lastname, String day, String month, String year, String email,
			String password, String confirmpassword) throws InterruptedException, IOException {
		
		// to create an object to call the function register
		Register reg = new Register();
		
		// to call the function by using the object
		reg.Register(firstname, lastname, day, month, year, email, password, confirmpassword);

	}

	@Test
	@DataProvider(name = "registerdata")
	public Object[][] testdata1() throws EncryptedDocumentException, IOException {

		// to pass the sheet name given in excel sheet
		String s = "RegisterPage";
		
		// to store the value from the excel sheet
		Object[][] data = ReadData.getData(s);
		
		// to return the stored data
		return data;
	}

	@Test(priority = 1, dataProvider = "logindata")
	public void Login1(String email, String password) throws InterruptedException {

		// to create an object to call the function
		Login l = new Login();
		
		// to call the function by using the object
		l.LoginTest(email, password);

	}

	@Test
	@DataProvider(name = "logindata")
	public Object[][] testdata2() throws EncryptedDocumentException, IOException {

		// to pass the sheet name given in excel sheet
		String excelSheetName = "Login";
		
		// to store the value from the excel sheet
		Object[][] data = ReadData.getData(excelSheetName);
		
		// to return the stored data
		return data;

	}

	@Test(priority = 2)
	public void logout1() throws IOException {

		// to create an object to call the function
		Logout l = new Logout();
		
		// to call the function by using the object
		l.logoutTest();
	}

}
