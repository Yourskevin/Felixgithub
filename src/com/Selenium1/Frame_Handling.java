package com.Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\SeleniumPractice\\Selenium_Basic\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.leafground.com/pages/frame.html");
				driver.manage().window().maximize();
				
//FRAME				
				driver.switchTo().frame(0);
				WebElement clickbutton = driver.findElement(By.id("Click"));
				clickbutton.click();
				
				WebElement textinside = driver.findElement(By.id("Click"));
				String text = textinside.getText();
				System.out.println("The text is :"+ text);
				
// TO COME BACK TO NATIVE HTML PAGE				
				driver.switchTo().defaultContent();
//NESTED FRAME.
				driver.switchTo().frame(1);
				driver.switchTo().frame("frame2");
				WebElement button2 = driver.findElement(By.id("Click1"));
				button2.click();
				
				driver.switchTo().defaultContent();
				List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
				int size1 = totalframe.size();
				System.out.println(size1);
	}

}
