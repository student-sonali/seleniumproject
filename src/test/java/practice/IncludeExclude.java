package practice;

import org.testng.annotations.Test;

public class IncludeExclude
{
	@Test(enabled=false)
	public void webpersonalloan() 
	{
		System.out.println("WebpersonaliLoan testcase");
		
	}
	@Test
	public void mobilepersonalloan() 
	{
		System.out.println("mobilepersonalloan testcase");
	}
	@Test
	public void APIpersonalLoan() 
	{
		System.out.println("ApipesonalLoan");
	}

}
