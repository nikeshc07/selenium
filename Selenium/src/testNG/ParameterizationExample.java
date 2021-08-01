package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {


	//to pass value  from xml code to manin class for that we are using parameterization

	@Test
	@Parameters("Name")
	public void printName(String name)
	{
		System.out.println("Name is "+name);
	}
}
