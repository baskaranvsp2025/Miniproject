package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class minipurchase {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BASKAR\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement login = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		login.sendKeys("baskaranvsp@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[@name='passwd'])[1]"));
		password.sendKeys("Baskar@#12345");
		
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		signin.click();
		
		TakesScreenshot ts6 = (TakesScreenshot) driver;
		File src6 = ts6.getScreenshotAs(OutputType.FILE);
		File dest6 = new File("C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Screenshot\\create3.png");
		FileUtils.copyFile(src6, dest6);
		
//		Alert confirm = driver.switchTo().alert();
//		confirm.dismiss();
		
		Thread.sleep(2000);
		WebElement dresses = driver.findElement(By.xpath("(//a[text()= 'Dresses'])[2]"));
		dresses.click();
		
		
		Thread.sleep(2000);
		WebElement printeddress = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']"));
		printeddress.click();
		
		
		
		driver.switchTo().frame(0);
		WebElement quantityincrease = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		
		
		Actions act = new Actions(driver);
		act.click(quantityincrease).build().perform();
		act.click(quantityincrease).build().perform();
		act.click(quantityincrease).build().perform();
		act.click(quantityincrease).build().perform();
		
		WebElement size = driver.findElement(By.name("group_1"));
		Select s1 = new Select(size);
		s1.selectByIndex(1);
		
		
		
		TakesScreenshot ts7 = (TakesScreenshot) driver;
		File src7 = ts7.getScreenshotAs(OutputType.FILE);
		File dest7 = new File("C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Screenshot\\create4.png");
		FileUtils.copyFile(src7, dest7);
		
		WebElement addtocart = driver.findElement(By.name("Submit"));
		act.click(addtocart).build().perform();
		
		
		
		
		
		driver.switchTo().defaultContent();
		WebElement proceed1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed1.click();
		
		
		Thread.sleep(2000);
		WebElement checkout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		checkout1.click();
		
		Thread.sleep(2000);
		WebElement checkout2 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		checkout2.click();
		
		WebElement checkbox = driver.findElement(By.id("cgv"));
		checkbox.click();
		
		WebElement proceedtocheckout =
		driver.findElement(By.name("processCarrier"));
		proceedtocheckout.click();
		
		WebElement payment =
		driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		
		WebElement confirmorder =
		driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmorder.click();
		

		
	
		
		Thread.sleep(1000);
		TakesScreenshot ts9 = (TakesScreenshot) driver;
		File src9 = ts9.getScreenshotAs(OutputType.FILE);
		File dest9 = new File("C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Screenshot\\create5.png");
		FileUtils.copyFile(src9, dest9);
		
		
		
//		Thread.sleep(2000);
//		WebElement quantity = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
//		
//		WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
//		quantity.click();
//		quantity.click();
//		quantity.click();
		
		
//		Thread.sleep(2000);
//		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
//		Select s1 = new Select(size);
//		s1.selectByIndex(2);
//		
//		
//		TakesScreenshot ts2 = (TakesScreenshot) driver;
//		File src2 = ts2.getScreenshotAs(OutputType.FILE);
//		File dest2 = new File("C:\\Users\\BASKAR\\eclipse-workspace\\Selenium_Test\\Screenshot\\create4.png");
//		FileUtils.copyFile(src2, dest2);
		
		
		//driver.switchTo().frame(0)
		
		//p[@id='add_to_cart']
		
		
		//Thread.sleep(5000);
		//driver.switchTo().frame("//iframe");
		//WebElement addtocart = driver.findElement(By.xpath("//button[@name='Submit']"));
		//addtocart.click();
		
		
//		Thread.sleep(3000);
//		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//		proceed.click();
//		
//		Thread.sleep(3000);
//		WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//		proceed2.click();
//		
//		Thread.sleep(3000);
//		WebElement finalproceed1 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
//		finalproceed1.click();
//		
//		
//		Thread.sleep(3000);
//		WebElement checkbutton = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		checkbutton.click();
//		
//		
//		Thread.sleep(3000);
//		WebElement finalproceed2 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
//		finalproceed2.click();
		
		
		
		
		
		
		
	}

}
