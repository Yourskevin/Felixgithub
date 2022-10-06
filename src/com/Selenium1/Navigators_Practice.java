package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigators_Practice {
	public static void main(String [] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.getTitle();
		driver.getCurrentUrl();
		
				
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));    // ID
		Search.sendKeys("Crocs for men");                                        // Search in
				
		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		click.click();
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.id("nav-logo-sprites"));
		home.click();
		
		
		driver.findElement(By.name("field-keywords")).sendKeys("Samsung mobiles below 50000"+Keys.ENTER);
		
		
		//driver.close();
	}

}
