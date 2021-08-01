package testNG;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitExample {
	org.openqa.selenium.WebDriver driver;
	long endTime;
	long startTime; 
	//beforesuite will execute before the @test anotation
	// to find the execution time of the test case use System.currentTimeMillis() method.
	@BeforeSuite
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium1\\\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@Test
	public void openGoogle()
	{
		startTime= System.currentTimeMillis();

	driver.get("http://www.google.co.in");

	}

	@Test
	public void openBing()
	{

		driver.get("http://www.Bing.com");


	}

	@Test
	public void openYahoo()
	{
		driver.get("http://www.yahoo.com");

	}
	//aftersuit will execute at last 
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time is "+totalTime);


	}
}
