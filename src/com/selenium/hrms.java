package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;

public class hrms {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://hrms.spi-global.com/#/login");
		

		driver.manage().window().maximize();
		
		WebElement username1 = driver.findElement(By.name("username"));
		username1.sendKeys("007027");
		
		
		WebElement password1 = driver.findElement(By.name("Password"));
		password1.sendKeys("Tamilnadu@12345");

//		WebElement username2 = driver.findElement(By.xpath("(//input[contains(@class, 'input100 form-control1 hideborder ng-untouched ng-pristine ng-invalid')])[2]"));
	//	username2.sendKeys("Tamilnadu@12345");
		
		WebElement login = driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
		login.click();
		
		//WebElement Hrrequest = driver.findElement(By.name("//a[@href='#/Home']"));
		//Hrrequest.click();
		
		
		
	}
}
