package kohlarTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Group1
{
	@BeforeClass
	void setup()
	{
		System.out.println();
		
	}
	@Test(groups= {"sanity"})
	void Login()
	{
		System.out.println();
		
	}
	@Test(groups= {"regression"})
	void search() 
	{
		System.out.println();
	}
	@Test(groups= {"sanity"})
	void verify() 
	{
		System.out.println();
	}
	@Test(groups= {"regression"})
	void found() 
	{
		System.out.println();
	}
	@AfterClass
	void teardown() 
	{
		System.out.println();
	}


}
