package com.sel;






import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;




public class InterviewQuesExample {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium1\\\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		
		//Dimension dimension = new Dimension(768,768);
		//driver.manage().window().setSize(dimension);

		
	}
}


// send key inputs without send keys method
//1.using javaScript executor

/*WebElement  search = driver.findElement(By.name("q"));
JavascriptExecutor executor =(JavascriptExecutor) driver;
//executor.executeScript("document.getElementsByName('q')[0].value ='om'","" );*/

//2.using webElement 
/*executor.executeScript("arguments[0].value='om'", search);*/

//3.Robot class
/*driver.switchTo().activeElement();
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_O);
robot.keyRelease(KeyEvent.VK_O);
robot.keyPress(KeyEvent.VK_M);
robot.keyRelease(KeyEvent.VK_M);*/


// this will be handiling on the exception and alwaysrun,and timeout
//expevctedException will used to avoid the test case failure we can use as pre defined condition
/*@Test(timeOut = 2000)
	public void parentclass() throws InterruptedException
	{
		Thread.sleep(3000);
	System.err.println("parent will execute");

	}

	@Test(dependsOnMethods = "parentclass",alwaysRun = false)
	public void childclass()
	{
	System.err.println("child will execute");
	}*/

//slect all the checkBox in a web page
/*driver.get("http://www.leafground.com/pages/checkbox.html");

		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));


		for (WebElement webElement : allcheckbox) {

			webElement.click();
		}*/



// to run a test case more than one time you can use below attribute invocationcount


/*@Test(invocationCount = 5)
public void parentclass() 
{ 

System.err.println("parent will execute");
}*/


//diff between assert and verify (verify if got failed also it will pass the test case but assert not)

/*@Test
public void assertTest()
{
	System.out.println("before Assertion");
	Assert.fail();//Assert.assertEquals(true, false);
	System.out.println("after Assertion");
}

@Test
public void verifyTest()
{
SoftAssert assert1  = new SoftAssert();
System.out.println("before Assertion");
assert1.fail();//Assert.assertEquals(true, false);
System.out.println("after Assertion");

}*/



// hovering 


/*WebElement  tamil = driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));

String beforehovering = tamil.getCssValue("text-decoration");
System.out.println("beofore hovering " + beforehovering);

Actions actions = new Actions(driver);
actions.moveToElement(tamil);
actions.perform();

String afterhovering = tamil.getCssValue("text-decoration");
System.out.println("after hovering " + afterhovering);*/



//scroll bar 

/*driver.get("http://www.echoecho.com/htmlframes06.htm");

JavascriptExecutor executor = (JavascriptExecutor) driver;
//scroll to some position
executor.executeScript("window.scroll(0,500)", "");
executor.executeScript("window.scroll(0,-500)", "");
//go to bottom of the page
executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
Thread.sleep(3000);
//top of the page
executor.executeScript("window.scroll(0,0)", "");
//go to specific element position
WebElement linkedText = driver.findElement(By.linkText("Online Tools"));
Thread.sleep(3000);
executor.executeScript("arguments[0].scrollIntoView(true)", linkedText)	;
//using robot class
Robot robot= new Robot();
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(3000);
robot.keyPress(KeyEvent.VK_PAGE_UP);
robot.keyRelease(KeyEvent.VK_PAGE_UP);*/



//switch to active element 
/*public class InterviewQuesExample {
static WebElement q;
	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//1 way 
		//driver.switchTo().activeElement().sendKeys("om kumar \n");

		// 2nd way to achive using pagefactory
		PageFactory.initElements(driver, InterviewQuesExample.class);
		q.sendKeys("om kumar \n");
	}

}*/


//print the google result urls

/*1 way 
		//driver.switchTo().activeElement().sendKeys("om kumar \n");

		// 2nd way to achive using pagefactory
		WebElement searchbox =driver.findElement(By.name("q"));
		searchbox.sendKeys("om kumar \n");
		Thread.sleep(1500);
		 /*List<WebElement> totallinks= driver.findElements(By.xpath("//a"));

		 for (WebElement links : totallinks) {
			System.out.println(links.getAttribute("href"));
		}
		 //fetch main links
		 List<WebElement> mainLinks = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		 for (WebElement links1 : mainLinks) {
		System.out.println(links1.getText());	
		}*/


// way to press enter key to perform google search 
/*driver.get("https://www.google.com/");
WebElement searchbox =driver.findElement(By.name("q"));	
// sendkeys

searchbox.sendKeys("om kumar"+Keys.ENTER);
//submit

searchbox.sendKeys("om kumar \n");
searchbox.submit();
//robot

searchbox.sendKeys("om kumar");
Robot robot= new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);*/



//click a google suggestion for the given search 

/*driver.get("https://www.google.com/");
WebElement searchbox =driver.findElement(By.name("q"));	
searchbox.sendKeys("om kumar");
Thread.sleep(3000);
List<WebElement> searchSuggestion = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
//using the position
int position = 0;
for (WebElement element :searchSuggestion) {
	System.out.println(element.getText());
	position++;

	if(position==3)
	{
		element.click();
		break;
	}
}
//using specific text to find the suggestion
for (WebElement element :searchSuggestion) {


	String text = element.getText();
	if(text.contains("facebook"))
	{
		element.click();
		break;
	}

}*/




//pop up 
/*
public class InterviewQuesExample {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}
}*/


//to maximize the window we have 3 ways
//1.using chrom options
/*ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized");
WebDriver driver = new ChromeDriver(options);

// 2. maximize
driver.get("https://www.google.com/");
driver.manage().window().maximize();
//3.dimension
Dimension dimension = new Dimension(768,768);
driver.manage().window().setSize(dimension);*/


