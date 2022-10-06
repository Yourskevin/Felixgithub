package com.Selenium_practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robots_Handling {
	
	public static void main(String[] args) throws Throwable 
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
    WebElement signup = driver.findElement(By.xpath("//div[@class='_6ltg']/descendant::a"));
    signup.click();
    Thread.sleep(2000);
    
    WebElement firstname =driver.findElement(By.xpath("//input[@name='firstname']"));
   firstname.sendKeys("Felix");
    
    WebElement lastname = driver.findElement
    		(By.xpath("//div[@class='placeholder']/following-sibling::input[@name='lastname']"));
    lastname.sendKeys("Prabhu");
    
    Robot obj = new Robot();
    obj.keyPress(KeyEvent.VK_TAB);
    obj.keyRelease(KeyEvent.VK_TAB);
    obj.keyPress(KeyEvent.VK_9);
    obj.keyRelease(KeyEvent.VK_9);
    
    obj.keyPress(KeyEvent.VK_9);
    obj.keyRelease(KeyEvent.VK_9);
    
    obj.keyPress(KeyEvent.VK_4);
    obj.keyRelease(KeyEvent.VK_4);
    
    obj.keyPress(KeyEvent.VK_0);
    obj.keyRelease(KeyEvent.VK_0);
    
    obj.keyPress(KeyEvent.VK_0);
    obj.keyRelease(KeyEvent.VK_0);
    
    obj.keyPress(KeyEvent.VK_3);
    obj.keyRelease(KeyEvent.VK_3);
    
    obj.keyPress(KeyEvent.VK_4);
    obj.keyRelease(KeyEvent.VK_4);
    
    obj.keyPress(KeyEvent.VK_4);
    obj.keyRelease(KeyEvent.VK_4);
    
    obj.keyPress(KeyEvent.VK_7);
    obj.keyRelease(KeyEvent.VK_7);
    
    obj.keyPress(KeyEvent.VK_8);
    obj.keyRelease(KeyEvent.VK_8);
    
    obj.keyPress(KeyEvent.VK_TAB);
    obj.keyRelease(KeyEvent.VK_TAB);
    
    
    Thread.sleep(2000);
    obj.keyPress(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(2000);
    obj.keyPress(KeyEvent.VK_PAGE_UP);
    
   
    
    
    Thread.sleep(2000);
    driver.quit();
}
}
