package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		// find the number of elements in the dropdown

		// by index
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropDown2);
		select2.selectByIndex(4);
		// by value
		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(dropDown3);
		select3.selectByValue("2");
		// by text
		WebElement dropDown4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		Select select4 = new Select(dropDown4);
		select4.selectByVisibleText("Selenium");

		// finding the number of elements in the dropdown
		List<WebElement> listOfOptions = select.getOptions();	
		int size = listOfOptions.size();
		System.out.println("number of elements: "+size);
		// using send keys in the drop down
		dropDown1.sendKeys("Loadrunner");
		// selecting 2 or more rows in the dropdown
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiSelectBox = new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);



	}

}
