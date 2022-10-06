package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Practice {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement cls = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		cls.click();
		
		WebElement login =driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		login.click();
		
		WebElement mailid =driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		mailid.sendKeys("9940034478");
		
		WebElement password =driver.findElement(By.xpath("(//input[@type='password'])"));
		password.sendKeys("362436");
		Thread.sleep(3000);
		
		WebElement tablogin =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		tablogin.click();
		Thread.sleep(3000);
		
		WebElement input =driver.findElement(By.xpath("(//input[@type='text'])"));
		input.sendKeys("Samsung Galaxy S20 FE"+Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		home.click();
		
		//BUTTONS OPTIONS
		
		driver.navigate().to("http://www.leafground.com/");
		WebElement leafground = driver.findElement(By.xpath("//img[@alt='Buttons']"));
		leafground.click();
		
	    // 1.TO FIND COLOUR
		
		WebElement findcolour= driver.findElement(By.xpath("//button[@style='background-color:lightgreen']"));
		String cssValueColour = findcolour.getCssValue("background-color");
		System.out.println("Button colour :"+cssValueColour);
		
		// 2.TO GET LOCATION(XY)
		
		WebElement getPositionButton  =driver.findElement(By.xpath("//button[@id='position']"));
		Point xylocation = getPositionButton.getLocation();
		int xvalue = xylocation.getX();
		int yvalue = xylocation.getY();
		
		System.out.println("X-location :" + xvalue);
		System.out.println("Y-Location :" + yvalue);
		
		// 3. TO GETSIZE(HEIGHT & WIDTH)
		
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		
		System.out.println("HEIGHT :"+ height);
		System.out.println("WIDTH :"+ width);
	
		
		Thread.sleep(3000);
		driver.close();

	}

}
