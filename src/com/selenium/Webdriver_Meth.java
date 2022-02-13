package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Meth {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		

		driver.manage().window().maximize();

		
		driver.navigate().to("https://www.flipkart.com/big-savings-days-coupon-store?s_kwcid=AL!739!3!569449905509!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_eta_mobile_goog&gclid=Cj0KCQiA5OuNBhCRARIsACgaiqVr6mTW9aB7Zf64YeuMPC_aLwYQRlUomOd15xheZYVZHGHBvR_6f44aAou-EALw_wcB");
		
		driver.navigate().back();
		
		String title = driver.getTitle();
		System.out.print("The Title is : " + title);
		
		String currUrl = driver.getCurrentUrl();
		System.out.print("current URL is:  " + currUrl);
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		

		
		
		WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("baskytheboss@gmail.com");


	//GetAttribute
	String name1 = username.getAttribute("name");	
	System.out.print(name1);
	
	
	String str1 = username.getAttribute("value");
		System.out.print(str1);
	
		
		
		//IsDisplayed

		boolean display1 = username.isDisplayed();
		System.out.println("Display is :" + display1);
	
		
		//IsEnabled
		
		boolean enable1 = username.isEnabled();
		System.out.println("Display is:"+ enable1);

		
		
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("12345");

WebElement login = driver.findElement(By.name("login"));
login.click();


	}

}
