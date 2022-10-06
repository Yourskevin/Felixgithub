package com.Selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation {

	public static void main(String[] args) throws Throwable 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));

	Actions mouse = new Actions(driver);
	mouse.moveToElement(women).build().perform();

	driver.findElement(By.xpath("//a[@title='Casual Dresses']")).click();
	
	JavascriptExecutor s = (JavascriptExecutor)driver;
	s.executeScript("window.scrollBy(0,835);");
	Thread.sleep(1000);
	
	WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
	mouse.moveToElement(cart).build().perform();
	cart.click();
	Thread.sleep(1000);
	
	WebElement checkout = driver.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
	checkout.click();

//LOGIN
	
//	WebElement login = driver.findElement(By.id("username"));
//	login.sendKeys("yoursfelix");
//	
//	WebElement password = driver.findElement(By.id("password"));
//	password.sendKeys("64TCE7");
//	
//	driver.findElement(By.id("login")).click();

	}

}
