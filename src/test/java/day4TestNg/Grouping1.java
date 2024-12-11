package day4TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping1 
{
	@BeforeMethod
	public void setup() 
	{
		System.out.println("login the applicaton");
		
	}
	@Test(priority=1, groups= {"regression"})
	public void login() 
	{
		System.out.println("login sucessfully");
		
	}
	@Test(priority=2,groups= {"sanity"})
	public void verify() 
	{
		System.out.println("verify element");
		
	}
	@AfterMethod
	public void teardown() 
	{
		System.out.println("close application");
	}

}
