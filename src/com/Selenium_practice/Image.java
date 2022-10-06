package com.Selenium_practice;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Image {
	public static void main(String[] args) throws InterruptedException, IOException  
	{

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Image.html");
	driver.manage().window().maximize();
	
	WebElement enter = driver.findElement(By.xpath("(//img)[2]"));
	enter.click();
}
}