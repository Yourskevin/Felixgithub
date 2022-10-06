package com.Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project2 {

	public static void main(String[] args) throws Throwable 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();

//LOGIN
	
	WebElement login = driver.findElement(By.id("username"));
	login.sendKeys("yoursfelix");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("64TCE7");
	
	driver.findElement(By.id("login")).click();
	
//PAGE 1
	
	WebElement location = driver.findElement(By.id("location"));
	
	Select s = new Select(location);
	s.selectByValue("London");
	
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select h = new Select(hotel);
	h.selectByVisibleText("Hotel Hervey");
	
	
	WebElement type = driver.findElement(By.id("room_type"));
	Select t = new Select(type);
	t.selectByIndex(1);
	
	WebElement roomtype = driver.findElement(By.id("room_nos"));
	Select n = new Select(roomtype);
	n.selectByIndex(2);
	
	WebElement checkIn = driver.findElement(By.id("datepick_in"));
	checkIn.clear();
	checkIn.sendKeys("15/08/2022");
	
	WebElement checkOut = driver.findElement(By.id("datepick_out"));
	checkOut.sendKeys("16/08/2022");
	
	WebElement adultCount = driver.findElement(By.id("adult_room"));
	Select a = new Select(adultCount);
	a.selectByValue("2");
	
	WebElement noOfChild = driver.findElement(By.id("child_room"));
	Select ch = new Select(noOfChild);
	ch.selectByVisibleText("0 - None");
	
	driver.findElement(By.id("Submit")).click();
	
//PAGE 2 - RADIO BUTTON
	
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();
	
//PAGE 3 - INFORMATION
	
	driver.findElement(By.id("first_name")).sendKeys("Felix");
	driver.findElement(By.id("last_name")).sendKeys("Prabhu");
	driver.findElement(By.id("address")).sendKeys("No.15/235,GKM Colony< Chennai-600082");
	driver.findElement(By.id("cc_num")).sendKeys("1234 2345 3456 4567");
	
	WebElement cardType = driver.findElement(By.id("cc_type"));
	Select ct = new Select(cardType);
	ct.selectByValue("MAST");
	
	WebElement expiryMonth = driver.findElement(By.id("cc_exp_month"));
	Select em = new Select(expiryMonth);
	em.selectByVisibleText("April");
	
	WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
	expiryyear.sendKeys("2024");
	
	driver.findElement(By.id("cc_cvv")).sendKeys("555");
	driver.findElement(By.id("book_now")).click();
	
//PAGE 4 - ITINERARY
	
	driver.findElement(By.id("logout")).click();
	driver.quit();
	
	}

}
