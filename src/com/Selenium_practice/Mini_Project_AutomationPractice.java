package com.Selenium_practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_AutomationPractice {
	public static void main(String args[]) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		WebElement women = driver.findElement(By.xpath("//div[@id='block_top_menu']//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();
		
		driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]")).click();
		
		JavascriptExecutor scrol = (JavascriptExecutor) driver;
		scrol.executeScript("window.scrollBy(0, 750);");
		
		WebElement dress = driver.findElement(By.xpath("(//img[@itemprop='image'])"));
		Actions select =new Actions(driver);
		select.moveToElement(dress).build().perform();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		
		
		WebElement proceedToCheck = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedToCheck.click();
		
		Thread.sleep(1000);
		WebElement quantity = driver.findElement(By.xpath("//input[@class='cart_quantity_input form-control grey']"));
		quantity.sendKeys("7");
		
		WebElement proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed.click();
		
		driver.findElement(By.xpath("(//input[@name='email_create'])")).sendKeys("kevin@ymail.com");
		
		WebElement createAccount = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		createAccount.click();	
		
// SIGN UP
		
		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Felix");
		driver.findElement(By.id("customer_lastname")).sendKeys("Prabhu");
		//driver.findElement(By.id("email")).sendKeys("kevin@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("AmmA@786");
		
		
//DOB
		WebElement day = driver.findElement(By.id("days"));
		Select s=new Select(day);
		s.selectByValue("5");
		
		WebElement month = driver.findElement(By.id("months"));
		Select m=new Select(month);
		m.selectByValue("5");
		
		WebElement years = driver.findElement(By.id("years"));
		Select y=new Select(years);
		y.selectByValue("1988");
		
		driver.findElement(By.id("uniform-newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
// ADDRESS
		driver.findElement(By.id("firstname")).sendKeys("Felix");
		driver.findElement(By.id("lastname")).sendKeys("Prabhu");
		driver.findElement(By.id("company")).sendKeys("XYZ-Tech");
		driver.findElement(By.id("lastname")).sendKeys("Prabhu");
		driver.findElement(By.id("address1")).sendKeys("No.15/235, GKM Colony, Perambur, Chennai -600082");
		driver.findElement(By.id("address2")).sendKeys("No.15/235, GKM Colony, Perambur, Chennai -600082");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		
		WebElement state =  driver.findElement(By.id("id_state"));
		Select st = new Select(state);
		st.selectByIndex(6);
		
		driver.findElement(By.id("postcode")).sendKeys("00082");
		WebElement country = driver.findElement(By.id("id_country"));
		Select ct = new Select(country);
		ct.selectByValue("21");
		 
		driver.findElement(By.id("other")).sendKeys("Near Park Town");
		
		driver.findElement(By.id("phone")).sendKeys("044-2108837");
		driver.findElement(By.id("phone_mobile")).sendKeys("9940034478");
		driver.findElement(By.id("alias")).sendKeys("Raja ph 9781136158");
		driver.findElement(By.id("submitAccount")).click();
		
//ADDERESS CONFIRMATION
		
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("make it as soon as possible");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
//SHIPPING
		
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
//PAYMENT
		
		driver.findElement(By.xpath("(//p[@class='payment_module'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

//SNAPSHOT
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File pic = shot.getScreenshotAs(OutputType.FILE);
		File store = new File("C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Screen_Shot\\project.png");
		FileHandler.copy(pic, store);
		
		
	}

}
