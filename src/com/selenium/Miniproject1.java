package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BASKAR\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		
		WebElement createemail = driver.findElement(By.xpath("//input[@id='email_create']"));

		createemail.sendKeys("baskytheboss@gmail.com");

		WebElement createaccount = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		createaccount.click();

		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Screenshot\\create1.png");
		FileUtils.copyFile(src, dest);
		
		
//		Alert confirm = driver.switchTo().alert();
//		confirm.dismiss();
		
		Thread.sleep(5000);
		WebElement title = driver.findElement(By.xpath("(//input[@name='id_gender'])[1]"));
		title.click();
		
		
		WebElement firstname1 = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname1.sendKeys("BASKARAN");
		
		
		WebElement lastname1 = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastname1.sendKeys("VIJAYAN");
		
		
		
		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		password.sendKeys("Baskar@#12345");
		
		Thread.sleep(2000);
		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		Select s1 = new Select(days);
		s1.selectByIndex(13);
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s2 = new Select(month);
		s2.selectByIndex(6);
		
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select s3 = new Select(year);
		s3.selectByValue("1983");	
		
		
//		Thread.sleep(5000);
//		WebElement notification1 = driver.findElement(By.xpath("(//input[@name='newsletter']"));
//		notification1.click();
//		
//		Thread.sleep(5000);
//		WebElement notification2 = driver.findElement(By.xpath("//input[@name='optin']"));
//		notification2.click();
		
//		Thread.sleep(2000);
//		WebElement firstname2 = driver.findElement(By.xpath("//input[@id='firstname']"));
//		firstname2.sendKeys("BASKARAN");
//		
//		Thread.sleep(2000);
//		WebElement lastname2 = driver.findElement(By.xpath("//input[@id='lastname']"));
//		lastname2.sendKeys("VIJAYAN");
		
		Thread.sleep(2000);
		WebElement companyname = driver.findElement(By.xpath("//input[@id='company']"));
		companyname.sendKeys("STRAIVE INDIA PVT LTD");
		
		
		Thread.sleep(2000);
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address1']"));
		address1.sendKeys("17801");
		
		
		Thread.sleep(2000);
		WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
		address2.sendKeys("International Blvd");
		

		Thread.sleep(4000);
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s4 = new Select(state);
		s4.selectByValue("47");
		
		
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Seattle");
		
		
		Thread.sleep(2000);
		WebElement zipcode = driver.findElement(By.xpath("//input[@name='postcode']"));
		zipcode.sendKeys("98158");
		
		
		Thread.sleep(4000);
		WebElement additional = driver.findElement(By.xpath("//textarea[@name='other']"));
		additional.sendKeys("Kindly Provide the additional offers");
		
		
		Thread.sleep(4000);
		WebElement homemobileno = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		homemobileno.sendKeys("9080554976");
		
		
		Thread.sleep(4000);
		WebElement mobileno = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		mobileno.sendKeys("8825880397");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Screenshot\\create2.png");
		FileUtils.copyFile(src1, dest1);
		
		
		Thread.sleep(4000);
		WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		register.click();
		
		
		
	}

}