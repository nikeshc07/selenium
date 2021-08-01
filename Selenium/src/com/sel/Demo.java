package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium1\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		  
		  //enter a search term 
		  //click the wikipedia link
		  
		  //driver.findElement(By.id("input")).sendKeys("Agni");
		  driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("om kumar"+ Keys.ENTER);
		  
          //driver.quit();
	}

}
