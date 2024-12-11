package infosystestNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class Listener implements ITestListener
{
	public void onStart(ITestContext context) 
	{
		System.out.println("Test execuition started");
	}
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test started");
	}
    
	public void onTestSucess(ITestResult result) 
	{
		System.out.println("Test pass");
	}
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test fail");
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test skipped");
	}
	
	public void onFinish(ITestContext context) 
	{
		System.out.println("test execuition completed");
	}
}
