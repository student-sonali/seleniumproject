package practice;

import org.testng.annotations.Test;

public class Attributes
{
	@Test(description=" This is web Application testcase")
	public void testcase1() 
	{
		System.out.println("Web application");
	}
	@Test(priority=1)
	public void testcase2() 
	{
		System.out.println("Mobile Application");
	}
	@Test(dependsOnMethods= {"testcase1"})
	public void testcase3() 
	{
		System.out.println("API application");
	}

}
