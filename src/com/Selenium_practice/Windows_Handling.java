package com.Selenium_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();

		WebElement windowsHandle = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[11]"));
		windowsHandle.click();

// WINDOWS HANDLE

		String oldwindow = driver.getWindowHandle(); // To store the current window identity-oldwindow

		WebElement option1 = driver.findElement(By.id("home"));
		option1.click();
		Thread.sleep(2000);

		Set<String> handles = driver.getWindowHandles(); // All the windows opened by driver will be stored in handles,
															// including PARENT WINDOW

		for (String swaptoNew : handles) {

			driver.switchTo().window(swaptoNew); // control is switched to new window
		}

		WebElement newWindow = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[2]"));
		newWindow.click();

		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(oldwindow); // TO SWITCH TO OLD DEFAULT WINDOW

		WebElement option2 = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")); // to know the no
																										// of windows
																										// opened
		option2.click();

		int noOfWindows = driver.getWindowHandles().size();
		System.out.println("No Of Windows Opened : " + noOfWindows);
		Thread.sleep(2000);

		WebElement option3 = driver.findElement(By.xpath("//button[text()='Do not close me ']")); // to close all window
																									// except parent
																									// window
		option3.click();
		
		Set<String> allNewWindows = driver.getWindowHandles();
		
		for (String newpages : allNewWindows) 
		{
			
			if(!newpages.equals(oldwindow))
			{
				driver.switchTo().window(newpages);
				driver.close();
			}	
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
