package com.Selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project  {
	public static void main(String []args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

//SIGNUP
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		driver.findElement(By.id("username")).sendKeys("yoursfelix");
		driver.findElement(By.id("password")).sendKeys("AmmA@123");
		driver.findElement(By.id("re_password")).sendKeys("AmmA@123");
		driver.findElement(By.id("full_name")).sendKeys("Felix Prabhu");
		driver.findElement(By.id("email_add")).sendKeys("yoursfelix@gmail.com");
		driver.findElement(By.id("captcha-form"));
		
		Thread.sleep(25000);//captcha
		
		driver.findElement(By.id("tnc_box")).click();
		driver.findElement(By.id("Submit")).click();
		
	}

}
