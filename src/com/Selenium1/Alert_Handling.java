package com.Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {
	public static void main(String [] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alerthandle =  driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alerthandle.click();
		
//SIMPLE ALERT
		Alert simple = driver.switchTo().alert();
		simple.accept();
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
//CONFIRM ALERT		
		WebElement no = driver.findElement(By.xpath("(//button[@onclick='confirmbox()'])"));
		no.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
//SENDKEYS ALERT		
		WebElement Sendkeyalert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		confirm.click();
		
		WebElement no1 = driver.findElement(By.xpath("(//button[@onclick='promptbox()'])"));
		no1.click();
		Alert sendkeysalert = driver.switchTo().alert();
		sendkeysalert.sendKeys("kevin");
		sendkeysalert.accept();
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
