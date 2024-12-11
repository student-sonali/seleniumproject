package seleniumCompany;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeMethod
	void launch() 
	{
		System.out.println("open chrome");
	}
	@Test(priority=2, groups= {"sanity"})
	void login() 
	{
		System.out.println("Login to application");
	}
	@Test(priority=1,groups= {"regression"})
	void verifytitle() 
	{
		System.out.println("verifying title");
		
	}
	@AfterMethod
	void teardown() 
	{
		System.out.println("quit the application");
	}

}
