package com.wipro.PagePOM;

import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import com.wipro.baseclass.BaseClass;

public class Logout extends BaseClass{
	
    public void logoutTest() throws IOException {
    	
    	//click on logout
        driver.findElement(By.xpath(prop2.getProperty("logout"))).click();
        
        //Locate the text file with the path
        FileWriter file = new FileWriter(System.getProperty("user.dir")+"/src/test/resources/textfile/Logout.txt");
        
        file.write("Logout Successfully");
        
        //close the textfile
        file.close();
    }

}
