package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDrop {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/BASKAR/Documents/1.html");

		driver.manage().window().maximize();
		
		//IsMultiple -- Not Working	
		WebElement single = driver.findElement(By.xpath("(//select[@width='300'])[1]"));
		Select s2 = new Select(single);
		boolean multiple2 = s2.isMultiple();
		System.out.println("The Drop Down Is:" + "  " + multiple2);  //is Multiple is False

		
		WebElement sel = driver.findElement(By.xpath("(//select[@width='300'])[1]"));
		Select s3 = new Select(sel);
		s3.selectByValue("red");
		sel.click();
		
		Thread.sleep(4000);
		
		WebElement multiple = driver.findElement(By.xpath("(//select[@width='300'])[2]"));
		//IsMultiple -- Working
		Select s = new Select(multiple); 
		boolean multi = s.isMultiple();
		System.out.println("The Drop Down Is:" + "  " + multi);  //is Multiple is True
		
		
		List<WebElement> multi1 = driver.findElements(By.xpath("(//option[@value='green'])[2]"));
		
		s.selectByValue("green");
		s.selectByIndex(2);
//		s.deselectByIndex(2); // Desekect
		s.selectByVisibleText("Orange");
		
		
		System.out.println("-----------------");
		System.out.println("*** All Options are Listed Below ***");

		List<WebElement> alloptions = s.getOptions();
		for (WebElement opt : alloptions) {
			String text1 = opt.getText();
			
			System.out.println(text1);
		}
		Thread.sleep(2000);
		//getAllSelectedOptions  --  Working
				System.out.println("*** All Selected Options ***");
				
				List<WebElement> allSelected = s.getAllSelectedOptions();
				for (WebElement select : allSelected) {
					
					String text = select.getText();
					System.out.println(text);
					
				}
		Thread.sleep(2000);
		
		System.out.println("-----------------");
		System.out.println("*** First Selected Options *** ");
		
		WebElement firstSelected = s.getFirstSelectedOption();
		String first = firstSelected.getText();
		System.out.println(first);
		
		
		//s.deselectAll();
		
		
}
	

}
