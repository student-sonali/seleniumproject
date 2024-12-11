package infosystestNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent; //populate common info on the report
	public ExtentTest test;// create test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext context) 
	{
		sparkReporter =new ExtentSparkReporter("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\reports\\myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Reort");
		sparkReporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("computer name", "localhost");
        extent.setSystemInfo("Envirement", "QA");
        extent.setSystemInfo("Tester name", "sonali");
        extent.setSystemInfo("OS", "Windows10");
        extent.setSystemInfo("Browser Name", "Chrome");
		
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test case PASSED is:"+ result.getName());
	}
	
	public void onTestfailure(ITestResult result) 
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "test case FAILED is:"+ result.getName());
		test.log(Status.FAIL, "Test case FAILED cause is"+ result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case skipped"+ result.getName());
	}
	
	public void onTestFinish(ITestContext context) 
	{
		extent.flush();
	}

}
