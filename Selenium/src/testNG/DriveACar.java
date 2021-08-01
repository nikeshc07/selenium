package testNG;

import org.testng.annotations.Test;

public class DriveACar {
//test case will run based on their method alphabetic
	//so we are using priority parameter here
	@Test(priority=0)
	public void startTheCar()
	{
		System.out.println("stat the car ");
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
