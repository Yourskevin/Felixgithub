package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Practice_Scroll {
	public static void main(String []args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
// TO GET TEXT FROM ANY WEBELEMENT
		
		WebElement findwords = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		String text = findwords.getText();
		System.out.println(text);
		
// JAVA SCRIPT- SCROLL DOWN
		
		JavascriptExecutor scrol = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//h2[text()='Shop for your baby by age']"));
		scrol.executeScript("arguments[0].scrollIntoView();",element);
		Thread.sleep(2000);
		
// SCROLL UP USING RANGE		
		scrol.executeScript("window.scrollBy(0,-2000);");
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
