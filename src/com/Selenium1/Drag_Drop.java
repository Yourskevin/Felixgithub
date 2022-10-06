package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String []args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
//DOUBLE CLICK
//		WebElement doubleckick1 = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[8]"));
//		Actions act = new Actions(driver);
//		act.doubleClick().build().perform();
		
	
// RIGHT CLICK-contextCLick
		
		WebElement droplink = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]"));
		Actions act = new Actions(driver);
		act.contextClick().build().perform();
	/*	
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable")); 
//DRAG & DROP 1		
    	Actions act = new Actions(driver);
//		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
//DRAG AND DROP2
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(3000);
		driver.quit();
		
    */		
		
		
	}

}
