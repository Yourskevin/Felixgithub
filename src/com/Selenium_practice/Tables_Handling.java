package com.Selenium_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_Handling {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://datatables.net/");
		driver.manage().window().maximize();

// TO FIND NO OF COLUMNS-th
		
		List<WebElement> columns =driver.findElements(By.tagName("th"));
		int columnCount=columns.size();
		System.out.println("NO OF COLUMNS :"+columnCount);
		
// TO FIND NO OF ROWS-td
		
		List<WebElement> rows = driver.findElements(By.tagName("td"));
		int RowCount = rows.size();
		System.out.println("NO OF ROWS :"+RowCount);
		
//TO GET VALUE NEXT TO LONDON-int
		
		WebElement londonValue = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[5]/td[4]"));
		String london = londonValue.getText();                //td[normalize-space()='Office Manager']//following::td[2]
		System.out.println("LONDON AGE :"+london );
		
//COMPAER AND FIND THE MINIMUM VALUE "//td[5]"
		
		List<WebElement> number =driver.findElements(By.xpath("//td[5]"));
	
		List<Long> ref = new ArrayList<Long>();
		
		for (WebElement listOf : number) {
		ref.add(Long.parseLong(listOf.getText().replace("/", "")));
		}	
		Long smallestValue=Collections.min(ref);
			
			System.out.println(smallestValue);	
		}
		
		
		
}

