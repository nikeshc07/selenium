package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");

		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");

		Thread.sleep(4000);//li inside the xpath mean ul list if you using the element under the list means you have to mention/li
		List<WebElement> optionList = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println(optionList.size());
		for (WebElement webElement : optionList) {
			String text = webElement.getText();
			if(text .equals("Web Services")){
				webElement.click();
				System.out.println("Selecting "+text);
				//using break for terminate the loop
				break;
			}
		}

	}

}
