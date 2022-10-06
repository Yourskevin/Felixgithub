package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1_Editb_Box {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("yoursfelixgmail.com");
		Thread.sleep(3000);
		
		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		append.sendKeys(" KEVIN");
		Thread.sleep(3000);
		
		WebElement getname = driver.findElement(By.name("username"));
		String attribute = getname.getAttribute("value");
		System.out.println(attribute);
		Thread.sleep(3000);
		
		WebElement clearit = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearit.clear();
		Thread.sleep(3000);
		
		driver.close();
	}
	

}
