package com.Selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tool_Tip 
{
public static void main(String[]args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/");
	driver.manage().window().maximize();
	
// TO TAKE SNAPSHOT
	
	TakesScreenshot shot = (TakesScreenshot) driver;
	File get =shot.getScreenshotAs(OutputType.FILE);
	File store = new File("C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Screen_Shot\\try1.png");
	FileHandler.copy(get, store);
	
// To get TOOL TIP Text
	
	WebElement toooltipattributes=driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[20]"));
	toooltipattributes.click();
	
	WebElement text =driver.findElement(By.xpath("(//input[@title='Enter your Name'])"));
	String attribute = text.getAttribute("title");
	System.out.println(attribute);
	
	Thread.sleep(2000);
	driver.quit();
}
}

