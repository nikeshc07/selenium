package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkwithtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.leafground.com/");
		  
		  driver.findElement(By.linkText("Go to Home Page")).click();
	}
}
