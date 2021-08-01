package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


/*[RemoteTestNG] detected TestNG version 7.3.0
 beofreSuite
 beforetest
 before class
 before method
 test
 after method
 afterclass
 aftertest*/
public class AnnotationHierachyExample {
  @Test
  public void test() {
	  System.out.println("i am test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am after method");
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am afterclass");
  }

  @BeforeTest
  
  
  public void beforeTest() {
	  
	  System.out.println("i am beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am beofreSuite");}

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am afterSuite");
  }

}
