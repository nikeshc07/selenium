package com.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\\\selenium3\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		//old window assigning using handle
		String oldWindow = driver.getWindowHandle();
		WebElement firstElement = driver.findElement(By.id("home"));
		firstElement.click();
		//will store all window in the driver
		/*Set<String> handles= driver.getWindowHandles();
		//moving control to new window using loop
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		driver.close();
		// moving control to default window(old window)
		driver.switchTo().window(oldWindow);*/

		WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		openMultiple.click();
		//using windowhandles to store bumber of windows
		int numberofwindow =driver.getWindowHandles().size();
		System.out.println("numberofwindows"+numberofwindow);

		//closing all window excpet parent

		WebElement dontCloseMe = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		dontCloseMe.click();
		Set<String> newWindowHandles = driver.getWindowHandles();

		// using loop for closing child window except parent
		for (String allWindows : newWindowHandles) {
			if(!allWindows.equals(oldWindow)) {

				driver.switchTo().window(allWindows);
				driver.close();
			}


		}
	
		}
	}

	


