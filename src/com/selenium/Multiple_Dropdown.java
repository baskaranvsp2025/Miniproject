package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/?.intl=us&.lang=en-US&src=yhelp&intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com&prompt=login");

		driver.manage().window().maximize();
		
		
		WebElement button = driver.findElement(By.xpath("//a[@id='createacc']"));		
		button.click();
		Thread.sleep(4000);
		

		WebElement multiple = driver.findElement(By.id("usernamereg-month"));
		
		//IsMultiple -- Working
		Select s = new Select(multiple); 
		boolean multi = s.isMultiple();
		System.out.println("The Drop Down Is:" + multi);  //is Multiple is False
		
		
		WebElement month = driver.findElement(By.id("usernamereg-month"));
		Select s1 = new Select(month);
		s1.selectByIndex(3);
		
		//s1.deselectByIndex(3);  //Not working in Deselect
		
		//getoptions -- Working
		
		System.out.println("*** All the Options below ***");
		List<WebElement> all = s.getOptions();
		
		for (WebElement full : all) {
			String s2 = full.getText();
			System.out.println(s2);
			
		}
		

		//getAllSelectedOptions  --  Working
		System.out.println("*** All Selected Options ***");
		
		List<WebElement> allSelected = s.getAllSelectedOptions();
		for (WebElement select : allSelected) {
			
			String text = select.getText();
			System.out.println(text);
			
		}
		
		//getFirstSelectedOption  -- Working
		
		System.out.println("*** First Element ***");
		WebElement firstSelected = s.getFirstSelectedOption();
		String first = firstSelected.getText();
		System.out.println(first);

		s.deselectAll();
		
	
//		WebElement month1 = driver.findElement(By.id("usernamereg-month"));
//		Select s1 = new Select(month1);
//		s1.deselectByValue("6");
	
		
		
//		WebElement day = driver.findElement(By.id("usernamereg-day"));
//		day.sendKeys("13");
//		
//		WebElement year = driver.findElement(By.id("usernamereg-year"));
//		year.sendKeys("1990");
		
	}
}
