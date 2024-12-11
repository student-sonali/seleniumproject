package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeClass
	public void beforeclass() 
	{
		System.out.println("This is BeforeClass");
	}
	@AfterClass
	public void afterclass() 
	{
		System.out.println("this is AfterClass");
	}
	@BeforeMethod
	public void test() 
	{
		System.out.println("This is test");
	}
	@Test
	public void test1() 
	{
		System.out.println("This is tes1");
	}
	@Test
	public void test2() 
	{
		System.out.println("This is test2");
	}
	@AfterMethod
	public void test3() 
	{
		System.out.println("This is test3");
	}

}
