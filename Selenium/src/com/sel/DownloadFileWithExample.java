package com.sel;

import java.io.File;

//import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
     WebElement downloadLink = driver.findElement(By.linkText("Download Excel"));
     downloadLink.click();
     
     
   // * File fileLocation = new File("C:\\selenium");
     
     File fileLocation = new File("C:\\Users\\ELCOT\\Downloads");
     
     File[] totalFiles = fileLocation.listFiles();
     
     for (File file : totalFiles) {
		
    	 if(file.getName().equals("testleaf.xlsx"))
    		 {
    		 System.out.println("File is downloaded");
    		 break;
    		 } 
    	 
	}
	}

}
