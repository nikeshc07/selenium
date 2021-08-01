package com.sel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");

		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int coulumnsize = columns.size();
		System.out.println("number of columns " +coulumnsize);

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowscount = rows.size();
		System.out.println("number of rows "+rowscount);

		//td[Learn to interact with Elements]//td[1]

		//td[normalize-space () ='Learn to interact with Elements']//following::td[1]
		WebElement getpercent = driver.findElement
				(By.xpath("//td[normalize-space () ='Learn to interact with Elements']//following::td[1]"));
		String percentage = getpercent.getText();
		System.out.println("percetage is "+percentage);
		
		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberLsit = new ArrayList<Integer>();
		
		
		for (WebElement webElement : allProgress) {
			String invidualscore = webElement.getText().replace("%", "");
			
			numberLsit.add(Integer.parseInt(invidualscore));
			
		}
		System.out.println("final list "+numberLsit);
		int smallvalue = Collections.min(numberLsit);
		System.out.println(smallvalue);
		
		
		//td[normalize-space='30%']//following::td[1]
		String smallValueString =Integer.toString(smallvalue)+"%";
		String finalXpath = "//td[normalize-space()="+"\""+ smallValueString + "\""+"]" +"//following::td[1]";
			
		
		System.out.println(finalXpath);
		
		WebElement check =driver.findElement(By.xpath(finalXpath));
		check.click();
	}

}
