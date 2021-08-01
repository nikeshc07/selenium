package testNG;

import org.testng.annotations.Test;

public class DependancisManagement {

	//when related dependencies priority will wont work here

	@Test(enabled = true)
	public void highschool()
	{
		System.out.println("High School");
	}

	@Test(dependsOnMethods="highschool")

	public void highsecondary()
	{
		System.out.println("High Secondary School");

	}
	@Test(dependsOnMethods="highsecondary")
	public void engineering()
	{
		System.out.println("College");
	}

	
}
