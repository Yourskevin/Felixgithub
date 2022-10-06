package com.Selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Sel {
	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
//		WebElement username =driver.findElement(By.xpath
//				("//script[@id='__LOADABLE_REQUIRED_CHUNKS__']//following::input[@type='text']"));
//		username.sendKeys("9940034478");
//		
//		WebElement password =driver.findElement(By.xpath("//script[@id='__LOADABLE_REQUIRED_CHUNKS__']//following::input[@type='password']"));
//		password.sendKeys("362436");
		
		driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2doB4z'])")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//div[text()='Appliances']")).click();
		
	}

}
