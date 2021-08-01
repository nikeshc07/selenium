package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\selenium3\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		WebElement java = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		java.click();
		// verifiying the selected one 
		WebElement seleniumButton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));

		boolean seleniumSelected = seleniumButton.isSelected();

		System.out.println(seleniumSelected);

		// de select the selected one
		WebElement firstelement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));

		if(firstelement.isSelected())
		{
			firstelement.click();
		}

		WebElement secoundElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));

		if(secoundElement.isSelected())
		{
			secoundElement.click();
		}

	}

}
