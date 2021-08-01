package com.selinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 {

	static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement  tamil = driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));

		String beforehovering = tamil.getCssValue("text-decoration");
		System.out.println("beofore hovering " + beforehovering);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(tamil);
		actions.perform();
		
		String afterhovering = tamil.getCssValue("text-decoration");
		System.out.println("after hovering " + afterhovering);
		
	}
}