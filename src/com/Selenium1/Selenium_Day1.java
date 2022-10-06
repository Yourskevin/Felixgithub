package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();
		drive.get("https://www.google.co.in/");
		drive.manage().window().maximize();
		drive.get("https://www.flipkart.com/");
		WebElement login = drive.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		
		WebElement username = drive.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		username.sendKeys("yourskevin@ymail.com");
		
		WebElement Pass = drive.findElement(By.xpath("//input[@type='password']"));
		Pass.sendKeys("362436");
		//Pass.sendKeys("362436"+Keys.ENTER);
		
		WebElement click = drive.findElement(By.xpath("(//span[text()='Login'])[2]"));
		click.click();
		
//		driver.get("https://www.flipkart.com/");
//
//		driver.manage().window().maximize();

//		WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
//		search.sendKeys("mobiles"+Keys.ENTER);
//
//		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		close.click();
//
//		WebElement baby = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[5]"));
//		baby.click();
//
//		WebElement becomeseller = driver.findElement(By.xpath("(//span[text()='Become a Seller'])[1]"));
//		becomeseller.click();
//
//		driver.navigate().back();
//
//		//driver.close();
//
//		driver.get("https://www.flipkart.com/");
//
//		driver.manage().window().maximize();
//
//		WebElement close1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		close1.click();
//
//		WebElement searchflip = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
//		searchflip.sendKeys("apple iphone 13 pro max"+Keys.ENTER);
//
//		driver.get("https://www.amazon.in/");
//
//		WebElement searchamazon = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		searchamazon.sendKeys("apple iphone 13 pro max");
//
//		WebElement amazonclick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//		amazonclick.click();
//
//		//driver.navigate().to("https://www.snapdeal.com/");
//		driver.get("https://www.snapdeal.com/");
//
//		WebElement searchsnapdeal = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
//		searchsnapdeal.sendKeys("apple iphone 13 pro max");
//		
//		//driver.quit();
//		WebElement snapdealclick = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
//		snapdealclick.click();
	}

}
