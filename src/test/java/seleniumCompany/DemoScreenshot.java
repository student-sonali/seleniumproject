package seleniumCompany;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenshot {

	public static void main(String[] args)
	{
         WebDriver driver =new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://testautomationpractice.blogspot.com/");
         driver.manage().window().maximize();
         
         TakesScreenshot ts=  (TakesScreenshot)driver;
         
        /* File source= ts.getScreenshotAs(OutputType.FILE);
         File dest= new File("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\Screenshots\\fullpage.png");
         source.renameTo(dest);*/
         
    /*   WebElement w=  driver.findElement(By.id("name"));
       File source= ts.getScreenshotAs(OutputType.FILE);
       File dest= new File("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\Screenshots\\specificpart.png");
       source.renameTo(dest);*/
         
      WebElement w=   driver.findElement(By.linkText("GUI Elements"));
    File source=  w.getScreenshotAs(OutputType.FILE);
File dest=    new File("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\Screenshots\\webelement.png");
    source.renameTo(dest);
	}

}
