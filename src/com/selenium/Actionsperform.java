package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsperform {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement clickbutton = driver.findElement(By.xpath("//button[text()= 'Click Me']"));
		Actions ac = new Actions (driver);
		ac.click(clickbutton).build().perform();
		
		Thread.sleep(1000);
		WebElement rightclickbut= driver.findElement(By.xpath("//button[text()= 'Right Click Me']	"));
		ac.contextClick(rightclickbut).build().perform();
		
		
		Thread.sleep(1000);
		WebElement Doubleclick2= driver.findElement(By.xpath("//button[text()= 'Double Click Me']"));
		ac.doubleClick(Doubleclick2).build().perform();
	
		
		driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
		
		Thread.sleep(5000);
		WebElement drag = driver.findElement(By.xpath("//img[@ondragstart='drag(event)']"));
		
		//WebElement drop = driver.findElement(By.xpath("//div[@ondrop='drop(event)']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@ondragover='allowDrop(event)']"));
		
		ac.dragAndDrop(drag, drop).build().perform();
		
	}

}
