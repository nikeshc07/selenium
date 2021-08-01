package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditwithExamples {

	public static void main(String[] args) {


		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");

		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("omkumarsivaraman05@gmail.com");
		//appand the text with textbox
		WebElement appandBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appandBox.sendKeys("om kumar");
		// get a value from text box
		WebElement getTextBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String value =getTextBox.getAttribute("value");

		System.out.println(value);

		//clear
		WebElement clearBox =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		//enabled or not
		WebElement enabledBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));


		boolean enabled= enabledBox.isEnabled();
		System.out.println(enabled);


	}
}