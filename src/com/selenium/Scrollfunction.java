package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollfunction {

	

public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/mobile-phones-store");

		driver.manage().window().maximize();
		

		WebElement scrl1 = driver.findElement(By.xpath("(//a[@class='_1arVWX'])[13]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrl1);
				
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -8000);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 2000);");
}
}
