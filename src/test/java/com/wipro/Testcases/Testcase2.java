package com.wipro.Testcases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import com.wipro.utilities.*;
import com.wipro.baseclass.BaseClass;
import com.wipro.PagePOM.*;

public class Testcase2 extends BaseClass{

		@Test(priority = 0, dataProvider = "logindata")
		public void Login1(String email, String password) throws InterruptedException, IOException {

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

		@Test(priority = 1)
		public void Myaccfunctionality() {

			// to create an object to call the function
			MyAccount m = new MyAccount();
			
			// to call the function by using the object
			m.myacnt();

		}

		@Test(priority = 2, dataProvider = "addressdata")
		public void addressfuctionality(String fname, String lname, String email, String country, String city,
				String address, String pin, String phone) throws IOException {

			// to create an object to call the function
			Address a = new Address();
			
			// to call the function by using the object
			a.address1(fname, lname, email, country, city, address, pin, phone);
			
		}

		@Test
		@DataProvider(name = "addressdata")
		public Object[][] testdata1() throws EncryptedDocumentException, IOException {
			
			// to pass the sheet name given in excel sheet
			String excelSheetName = "Address";
			
			// to store the value from the excel sheet
			Object[][] data = ReadData.getData(excelSheetName);
			
			// to return the stored data
			return data;

		}

		@Test(priority = 3)
		public void LogoutFunction() throws IOException {
			
			// to create an object to call the function
			Logout lg = new Logout();
			
			// to call the function
			lg.logoutTest();

		}

}
