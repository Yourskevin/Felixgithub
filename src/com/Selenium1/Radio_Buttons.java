
package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Buttons {
	public static void main(String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		WebElement launchgroundleaf = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[6]"));
		launchgroundleaf.click();
		Thread.sleep(2000);
		
// TO CHECK THE RADIO BUTTON IS SELECTED OR NOT		
		WebElement a1 = driver.findElement(By.xpath("(//input[@type='radio'])[6]"));
		boolean checkbox = a1.isSelected();
		System.out.println(checkbox);
		Thread.sleep(2000);
		
// TO SELECT THE RADIO BUTTON		
		WebElement b1 = driver.findElement(By.xpath("(//input[@type='radio'])[7]"));
		b1.click();
		
		WebElement c1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		if(c1.isSelected())
			System.out.println("Selected");
		else
			System.out.println("Not selected");
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	

}
