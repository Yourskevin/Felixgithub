
package com.Selenium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Minimize_Dimension_Point {
	public static void main(String args[]) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();

//TAKE SNAP SHOT
		
		TakesScreenshot snap =(TakesScreenshot) driver;
		File pic = snap.getScreenshotAs(OutputType.FILE);
	    File store = new File("C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Screen_Shot/tc.png");
		FileHandler.copy(pic, store);
	    
//MINIMIZE USING DIMENSION-class
			
		Dimension screen = new Dimension(500,500);
		driver.manage().window().setSize(screen);
		
		driver.manage().window().maximize();
		
//MINIMIZE USING POINT-class
		
		Point p = new Point(250,250);
		driver.manage().window().setPosition(p);
		
		driver.manage().window().maximize();
		
// NORMAL MINIMIZE
		
		driver.manage().window().minimize();
		
	}

}
