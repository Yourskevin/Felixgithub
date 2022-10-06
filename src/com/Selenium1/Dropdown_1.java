package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		 
		driver.get("http://www.leafground.com/");
		WebElement leafground = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[5]"));
		leafground.click();
		
// SELECT BY INDEX
		
		WebElement throughIndex = driver.findElement(By.xpath("(//select[@id='dropdown1'])"));
		Select s = new Select(throughIndex);
		s.selectByIndex(2);
		Thread.sleep(3000);
		
// SELECT BY VALUE
		
		WebElement throughvalue = driver.findElement(By.xpath("(//select[@name='dropdown2'])"));
		Select v=new Select(throughvalue);
		v.selectByValue("3");
		Thread.sleep(3000);
		
// SELECT BY VISIBLE TEXT
		
		WebElement throughTex = driver.findElement(By.xpath("(//select[@name='dropdown2'])"));
		Select t= new Select(throughTex);
		t.selectByVisibleText("Loadrunner");
		Thread.sleep(3000);
		
// SELECT BY SEND KEYS- To select from multiple option		
		
		WebElement throughSendkeys = driver.findElement(By.xpath("(//select[@class='dropdown'])"));
		throughSendkeys.sendKeys("Selenium");
		Thread.sleep(3000);
		driver.close();
	}

}
