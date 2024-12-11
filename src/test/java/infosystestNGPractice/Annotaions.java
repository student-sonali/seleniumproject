package infosystestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaions 
{
	@BeforeClass
	void setup() 
	{
		System.out.println("open page");
	}
	@Test(priority=2)
	void login() 
	{
		System.out.println("login to page");
	}
	@Test(priority=1)
	void verifytitle() 
	{
		System.out.println("verifying titile");
	}
	@AfterClass
	void logout() 
	{
		System.out.println("logout application");
	}

}
