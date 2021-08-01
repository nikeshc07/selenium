package testNG;

import org.testng.annotations.Test;

public class SkipTestCase {
	@Test(priority=0)
	public void startTheCar()
	{
		System.out.println("stat the car ");
	}
	//to skip test case use enabled parameter to making false
	//by default enabled value is true for all test cases
	@Test(priority=5,enabled=false)
	public void musicturnedOn()
	{
		System.out.println("music turned on");
	}
	@Test(priority=1)
	public void putFirstGear()
	{
		System.out.println("First gear");
	}
	@Test(priority=2)
	public void putSecoundGear()
	{
		System.out.println("Secound Gear ");
	}
	@Test(priority=3)
	public void putThriedGear()
	{
		System.out.println("Third gear ");
	}
	@Test(priority=4)
	public void putFourthGear()
	{
		System.out.println("Fourth gear ");
	}
	
}
