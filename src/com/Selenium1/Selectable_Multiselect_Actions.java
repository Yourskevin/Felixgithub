
package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable_Multiselect_Actions {
	public static void main(String []args) throws Throwable
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.leafground.com/");
	driver.manage().window().maximize();
	
	
	WebElement multiselect = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[15]"));
	multiselect.click();
	
	List<WebElement> listdown = driver.findElements(By.xpath("//ol[@class='ui-selectable']/li"));
	int total = listdown.size();
	System.out.println(total);
	
	Actions act = new Actions(driver);
	act.keyDown(Keys.CONTROL).click(listdown.get(0))
	.click(listdown.get(1))
	.click(listdown.get(4))
	.click(listdown.get(3)).build().perform();
	
	//act.keyDown(Keys.CONTROL).click(listdown.get(0));
	
	Thread.sleep(2000);
	driver.quit();
	}

}
