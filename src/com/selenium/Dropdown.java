package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/?.intl=us&.lang=en-US&src=yhelp&intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com&prompt=login");

		driver.manage().window().maximize();

		
	WebElement button = driver.findElement(By.xpath("//a[@id='createacc']"));		
		button.click();
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.id("usernamereg-month"));
		Select s = new Select(month);
		s.selectByValue("6");
		
		
		WebElement day = driver.findElement(By.id("usernamereg-day"));
		day.sendKeys("13");
		
		WebElement year = driver.findElement(By.id("usernamereg-year"));
		year.sendKeys("1990");
		
		//Single Drop-Down
		
		//1.  selectByValue  --  Working
		//2.  selectByIndex  --  Working
		//3.  selectByVisibleText  --  Working
		//4.  deselectByValue  -- Not Working
		//5.  deselectByIndex  -- Not Working
		//6.  deselectByVisibleText  -- Not Working
		//7.  isMultiple  --  Working
		//8.  getAllSelectedOptions  --  Working
		//9.  getFirstSelectedOption -- Working
		//10. getOptions  --  Working
		//11. deselectAll  -- Not Working
		
		
	
	}

}
