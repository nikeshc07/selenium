package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {


	String name ="om kumar";
	@Test
	public void checkEqual()
	{

		Assert.assertEquals(name, "om kumar");

	}
}
