package com.Selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartImage {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);

		WebElement camA = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		act.moveToElement(camA).build().perform();

	}
}
