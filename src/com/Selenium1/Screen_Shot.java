package com.Selenium1;

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

public class Screen_Shot {

	public static void main(String[] args) throws InterruptedException, IOException  
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=n5nDjsy-GMo");
		driver.manage().window().maximize();
		
		WebElement enter = driver.findElement(By.xpath("//input[@autocapitalize='none']"));
		enter.sendKeys("Ilayaraja Hits");
		
		
		
//	TakesScreenshot store = (TakesScreenshot) driver;
//		
//		File s=store.getScreenshotAs(OutputType.FILE);
//		File pic = new File("C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Screen_Shot\\image3.png");
//	FileUtils.copyFile(s, pic);
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File b = shot.getScreenshotAs(OutputType.FILE);
		File v = new File("C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Screen_Shot\\phelix.png");
		FileHandler.copy(b, v);
				
				
		
		
	}

	
		
	
}
