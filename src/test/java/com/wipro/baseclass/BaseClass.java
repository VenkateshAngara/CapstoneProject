package com.wipro.baseclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver = null;
	public static Properties prop1 = new Properties();
	public static Properties prop2 = new Properties();
	public static FileReader file1;
	public static FileReader file2;
	
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setUp() throws IOException {
		if (driver == null) {
			 file1 = new FileReader(
					System.getProperty("user.dir")+"/src/test/resources/configfiles/config.properties");
			 file2 = new FileReader(
					 System.getProperty("user.dir")+"/src/test/resources/configfiles/locator.properties");
			prop1.load(file1);
			prop2.load(file2);
		}
		
		if (prop1.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get(prop1.getProperty("url"));
		} 
		else if (prop1.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);
			driver.get(prop1.getProperty("url"));
		} 
		else {
			WebDriverManager.safaridriver().setup();
			driver= new SafariDriver();
			driver.get(prop1.getProperty("url"));
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void TakeScreen(String outputFilePath) throws IOException {
		Date currentdate = new Date();
		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotFile, new File(outputFilePath + screenshotfilename + ".jpg"));
	}


	@AfterClass
	public void windUp() {
		driver.close();
		System.out.println("Test Successful");
	}

}
