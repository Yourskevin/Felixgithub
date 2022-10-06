package com.Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink_Practice {
	
	public static void main (String [] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement home = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/child::i"));
		 home.click();
		 Thread.sleep(2000);
		 
// GO TO HOME PAGE
		 
		 WebElement bestsell = driver.findElement(By.xpath("(//div[@id='hmenu-contenat']//child::a[text()='Best Sellers' and @class='hmenu-item'])[1]"));
		 bestsell.click();
//		 Thread.sleep(2000);
		 
		// driver.navigate().back();
		 Thread.sleep(2000);
		 
// 		 
		 
		 driver.quit();
	}

}
