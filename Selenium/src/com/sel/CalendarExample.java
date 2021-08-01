package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calandar = driver.findElement(By.id("datepicker"));
		//Thread.sleep(3000);
		//calandar.sendKeys("05/10/2021"+Keys.ENTER);
		 
		calandar.click();
		
		WebElement nextButton = driver.findElement(By.xpath("//a[@title ='Next']"));
		nextButton.click();
		
		WebElement dateToBeGiven = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		dateToBeGiven.click();
}

}