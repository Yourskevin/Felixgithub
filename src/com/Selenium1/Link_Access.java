package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Access {
	public static void main(String [] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.leafground.com/");         // Launch URL
		driver.manage().window().maximize();             // maximize
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
