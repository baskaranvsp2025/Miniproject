package com.selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class temp {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		String newWindow = driver.getWindowHandle();

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		driver.get("https://dzone.com/articles/handling-multiple-browser-tabs-with-selenium-autom");
		
		

		//((JavascriptExecutor)driver).executeScript("window.open().");
		//driver.get("https://dzone.com/articles/handling-multiple-browser-tabs-with-selenium-autom");
		
	}

}
