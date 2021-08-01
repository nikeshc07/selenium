package com.sel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver= null;
		FileInputStream fileOutputStream = new FileInputStream("config.properties");

		Properties properties = new Properties();
		properties.load(fileOutputStream);

		String browser= properties.getProperty("browser");
		String driverlocation= properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("chromeoo  "))
		{
			System.setProperty("webdriver.chrome.driver",driverlocation);
			driver = new ChromeDriver();
		}


		driver.get("http://www.leafground.com/pages/Alert.html");
		//alert box
		WebElement Alertbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		Alertbox.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		//confirmation box
		WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmButton.click();

		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		//promt box
		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();

		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("omkumar");
		promptAlert.accept();
	}

}
