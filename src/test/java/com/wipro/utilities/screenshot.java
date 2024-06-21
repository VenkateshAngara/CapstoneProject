package com.wipro.utilities;

import java.io.File;
import java.io.IOException;
//import java.nio.file.Files;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.testng.reporters.Files;
import com.google.common.io.Files;
import com.wipro.baseclass.BaseClass;


public class screenshot extends BaseClass{
	
	public void ss(WebDriver d,String name) throws IOException {
		
		Date date= new Date();
		String curr_date = date.toString().replace("", "-").replace(":","-");
		TakesScreenshot s=(TakesScreenshot) d;
		File f=s.getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File(System.getProperty("user.dir")+"/src/test/resources/screenshots/screenshots"+ curr_date+".png"));
		
	}

}
