package com.sel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\selenium1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homepage =driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		
		driver.navigate().back();
		
		WebElement findWhere = driver.findElement(By.partialLinkText("Find where"));
		String where = findWhere.getAttribute("href");
		System.out.println("this is link is going to " +where);
		
		WebElement broken = driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		
		String title = driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("link is broken");
		}
		
		driver.navigate().back();
		
		WebElement homepage1 =driver.findElement(By.linkText("Go to Home Page"));
		homepage1.click();
		
		driver.navigate().back();
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		int countOfLink = totallinks.size();
		System.err.println("total linke" +countOfLink);
		}

}


