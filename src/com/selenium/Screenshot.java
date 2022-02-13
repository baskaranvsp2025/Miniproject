package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtilsCopyToFileTestCase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		
		TakesScreenshot ts1= (TakesScreenshot) driver;
		
		 File src1 = ts1.getScreenshotAs(OutputType.FILE);
		 
		 File dest1 = new File ("C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Screenshot\\amazon.png");
		 
		 FileUtils.copyFile(src1, dest1);		
		 
		 
		 driver.navigate().to("https://www.facebook.com/");
 
		 
		 //driver.get("https://www.facebook.com/");

			//driver.manage().window().maximize();
			
			
			TakesScreenshot ts2= (TakesScreenshot) driver;
			
			 File src2 = ts2.getScreenshotAs(OutputType.FILE);
			 
			 File dest2 = new File ("C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Screenshot\\facebook\\facebook.png");
			 
			 FileUtils.copyFile(src2, dest2);		
		 
}

}
