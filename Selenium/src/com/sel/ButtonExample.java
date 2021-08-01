package com.sel;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Button.html");
		// get the xy position of the button
         WebElement getPositionButton = driver.findElement(By.id("position"));
         Point xypoint = getPositionButton.getLocation();
         int xValue= xypoint.getX();
         int yValue =xypoint.getY();
         System.out.println("X valeu is : "+xValue+"y value is :"+yValue);
         
       // find the color
          WebElement colorButton = driver.findElement(By.id("color"));
         String color =  colorButton.getCssValue("background-color");
      
          System.out.println("Button color is :" +color);
          
         
          // find the size
          
          WebElement sizeButton = driver.findElement(By.id("size"));
          int height = sizeButton.getSize().getHeight();
          int width = sizeButton.getSize().getWidth();
          System.out.println("Height is "+height+"Widh is:"+width);
          
          // go to home
          
          WebElement homeButton = driver.findElement(By.id("home"));
          homeButton.click();
          
	}
 
}
