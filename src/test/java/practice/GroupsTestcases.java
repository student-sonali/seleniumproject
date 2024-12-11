package practice;

import org.testng.annotations.Test;

public class GroupsTestcases 
{
	@Test(groups= {"sanity testcases"})
	public void demo1() 
	{
		System.out.println("This Sanity testcase1");
	}
	@Test(groups= {"sanity testcases"})
	public void demo2() 
	{
		System.out.println("this is sanity testcase2");
	}
	@Test(groups= {"regression testcases"})
	public void demo3() 
	{
		System.out.println("This is regression testcase3");
	}
	@Test(groups= {"regression testcases"})
	public void demo4() 
	{
		System.out.println("This is regression testcase4");
	}

}
