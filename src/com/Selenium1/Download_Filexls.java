package com.Selenium1;

import java.io.File;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_Filexls 
{

	public static void main(String[] args) 
		{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement linkdownload = driver.findElement(By.linkText("Download Excel"));
		linkdownload.click();
		
		//C:\Users\hp\Downloads
		File find = new File("C:\\Users\\hp\\Downloads");
		File[] listFiles = find.listFiles();
		
		
	for( File count:listFiles)
	{
	
		if(count.getName().equals("Department.xlsx"))
		{	
			System.out.println("File is downloaded.xls");
		break;
		}
	}

}
}
