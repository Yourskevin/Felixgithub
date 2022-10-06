package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete_Handling {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("leaf ground" + Keys.ENTER);

		WebElement leafground = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		leafground.click();

		WebElement autocomplete = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[17]"));
		autocomplete.click();

		WebElement enterchar = driver.findElement(By.xpath("(//input[@id='tags'])"));
		enterchar.sendKeys("s");
		Thread.sleep(3000);

		List<WebElement> objs = driver.findElements(By.xpath("(//ul[@id='ui-id-1'])/li"));
		int total = objs.size();
		System.out.println(total);

		for (WebElement each : objs) 
		{
			if (each.getText().equals("SOAP")) 
			{
				each.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
