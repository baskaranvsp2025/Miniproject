package com.selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Sim {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/BASKAR/Documents/1.html");

		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		button1.click();
		
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();

		Thread.sleep(4000);
		
		WebElement button2 = driver.findElement(By.xpath("//button[@onclick='myFunct()']"));
		button2.click();
		Alert confirm = driver.switchTo().alert();
		//confirm.accept();
		confirm.dismiss();
		System.out.println(confirm);
		
		Thread.sleep(4000);
		
		WebElement button3 = driver.findElement(By.xpath("//button[@onclick='myFun()']"));
		button3.click();
		Alert ConfirmAlert = driver.switchTo().alert();
		ConfirmAlert.accept();

}


	
}
