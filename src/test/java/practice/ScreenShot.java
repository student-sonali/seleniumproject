package practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
	
		TakesScreenshot sc=  ( (TakesScreenshot)driver);
	File src=	sc.getScreenshotAs(OutputType.FILE);
    File dest= new File("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\ScreenShots\\fullpage.png");
    FileUtils.copyFile(src, dest);

	}

}
