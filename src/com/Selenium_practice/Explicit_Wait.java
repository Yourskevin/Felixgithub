package com.Selenium_practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	
	public static void main(String args [])
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().minimize();
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		WebElement username = driver.findElement(By.xpath("(//input[@placeholder='Enter registered email'])[1]"));
		username.sendKeys("yoursfelix@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])"));
		password.sendKeys("AmmA@123");
		
		driver.findElement(By.xpath("(//button[text()='LOGIN'])")).click();
		
// ROLL ALERT - mover from ELEMENTS to SOURCES - click (F8 F8)- to get xpath
		
	WebDriverWait wait=new WebDriverWait(driver, null);
		
		
		WebElement text=driver.findElement(By.xpath("(//div[text()=' Welcome FELIX '])"));
		wait.until(ExpectedConditions.textToBePresentInElement(text,  " Welcome FELIX " ));
		
		System.out.println(text.getText());
		
	}
	

}
