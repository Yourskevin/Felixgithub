package com.Selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 WebDriverWait wait=new WebDriverWait(driver, null);
	 
}
}
