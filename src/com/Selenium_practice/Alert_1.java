package com.Selenium_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01ovmaw7ssh6f51ts5qp5slydn7357378.node0");
		driver.manage().window().maximize();

		
		
		WebElement dtext =driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));
		String attribute = dtext.getAttribute("value");
		System.out.println(attribute);
		
		
		

//		WebElement leafground = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[9]"));
//		leafground.click();
		
//SIMPLE ALERT
	/*	
		WebElement alertclick = driver.findElement(By.xpath("(//button[@onclick='normalAlert()'])"));
		alertclick.click();
		Alert popup = driver.switchTo().alert();
		popup.accept();
		Thread.sleep(3000);
		
//CONFIRM ALERT
		
		WebElement alertclick2 = driver.findElement(By.xpath("(//button[@onclick='confirmAlert()'])"));
		alertclick2.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		Thread.sleep(3000);
*/		
//PROMPT ALERT
		
//		WebElement promptalert = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
//		promptalert.click();
//		Alert alertprompt = driver.switchTo().alert();
//		alertprompt.sendKeys("Thank you");
//		Thread.sleep(3000);
//		//alertpropmt.dismiss();
//		
//		
//		
//		
//		
//		Thread.sleep(3000);
//		driver.close();

	}

}
