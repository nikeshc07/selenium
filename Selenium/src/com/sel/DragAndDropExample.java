package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium3\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");

		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To = driver.findElement(By.id("droppable"));
		// if you use mouse related action use actions class
		Actions actions = new Actions(driver);
		// wihtout build and perform method we cant drag and drop
		//actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		// another way to drag and drop
		Thread.sleep(3000);
		actions.dragAndDrop(From, To).build().perform();
	}

}
