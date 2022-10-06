package com.Selenium_practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Implicit_Wait_Function {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
//IMPLICIT WAIT
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement signup =driver.findElement(By.xpath("//p[@ class='izU2O ']/descendant::span[text()='Sign up']"));
		signup.click();
		
	
		WebElement username =driver.findElement(By.xpath
				("//span[text()='Mobile Number or Email']/following-sibling::input"));
		username.sendKeys("9940034478");
// ROBOT		
		Robot obj = new Robot();
		obj.keyPress(KeyEvent.VK_TAB);
		obj.keyRelease(KeyEvent.VK_TAB);
		
		obj.keyPress(KeyEvent.VK_F);
		obj.keyRelease(KeyEvent.VK_F);
		
		obj.keyPress(KeyEvent.VK_E);
		obj.keyRelease(KeyEvent.VK_E);
		
		obj.keyPress(KeyEvent.VK_L);
		obj.keyRelease(KeyEvent.VK_L);
		
		obj.keyPress(KeyEvent.VK_I);
		obj.keyRelease(KeyEvent.VK_I);
		
		obj.keyPress(KeyEvent.VK_X);
		obj.keyRelease(KeyEvent.VK_X);
		
// SNAPSHOT		
		
//		TakesScreenshot snap = (TakesScreenshot) driver;
//		File pic = snap.getScreenshotAs(OutputType.FILE);
//		File loc = new File("C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Screen_Shot/log.png");
//		FileHandler.copy(pic, loc);

		
		
		
		
		
		
		
		
			
	}

}
