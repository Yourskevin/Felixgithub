package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowm_2 {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com");
		WebElement findleaf = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[5]"));
		findleaf.click();
		
// TO FIND IS THE DROPDOWN IS MULTISELECT
		
		WebElement multipledrop = driver.findElement(By.xpath("(//select)[6]"));
		Select mdrop = new Select(multipledrop);
		System.out.println(mdrop.isMultiple());
		
//		if(mdrop.isMultiple()==true)
//			System.out.println("Is Multiple");
//		else
//			System.out.println("Is not multiple");
		
// TO SELECT MULTIPLEDROP DOWN
		
		mdrop.selectByIndex(1);
		Thread.sleep(2000);
		mdrop.selectByValue("3");
		Thread.sleep(2000);
		mdrop.selectByVisibleText("Appium");
		
// TO KNOW THE LIST COUNT	
		
		List<WebElement> listdown = mdrop.getAllSelectedOptions();
		int size = listdown.size();
		System.out.println("Count "+ size);
		
// TO LIST DOWN EACH ELEMENT SELELCTED	
		
		for(WebElement l:listdown)             
			System.out.println(l.getText());
		 
		
 //TO DE-SELECT & DE-SELECT ALL & SELECT ALL
		
		mdrop.deselectByIndex(1);
		mdrop.deselectAll();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
