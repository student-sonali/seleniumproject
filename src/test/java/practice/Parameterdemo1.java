package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterdemo1 
{
	@Test
    @Parameters({"i","j"})
	public void add(int a, int b)
	{
		System.out.println("Addition"+ a+b);
	}
	@Test
	@Parameters({"i","j"})
	public void multification(int a, int b)
	{
		System.out.println("multification"+ a*b);
		
	}


}
