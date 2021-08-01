package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		//we are using find elements here so we have to use List
		List<WebElement> Selectable = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));

		int listsize = Selectable.size();
		System.out.println(listsize);
// using action class here
		Actions actions = new Actions(driver);
// keydown method used to select down ways
		//get 0 ,1,2 are inside list
		 
		actions.keyDown(Keys.CONTROL).
		click(Selectable.get(0)).
		click(Selectable.get(1)).
		click(Selectable.get(2)).build().perform();
		
		// another way of doin gselectabe
		
		
		/*actions.clickAndHold(Selectable.get(0));
actions.clickAndHold(Selectable.get(1));
actions.clickAndHold(Selectable.get(2));
actions.build().perform();*/
	}

}
