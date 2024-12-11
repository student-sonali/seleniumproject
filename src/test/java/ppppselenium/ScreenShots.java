package ppppselenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.booking.com/searchresults.en-gb.html?aid=356980&label=gog235jc-1BCAsobEIadHJhdHRpbm8tcmVzb3J0cy1wYW5jaGdhbmlIM1gDaGyIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AvCovLoGwAIB0gIkOWU1NTkyZDEtMTI0ZC00NjRmLWI4YTktZDUyNjJkYTgwNGYw2AIF4AIB&highlighted_hotels=11946120&checkin=2024-12-20&redirected=1&city=-2107007&hlrd=user_sh&group_adults=2&source=hotel&checkout=2024-12-21&keep_landing=1&sid=5ffcccf7d1496be420668034028409d7");
		driver.manage().window().maximize();
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
	   /* File source=ts.getScreenshotAs(OutputType.FILE);
        File dest= new File("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\ss\\fullpage.png");
        source.renameTo(dest);*/
		
		/*WebElement w=driver.findElement(By.xpath("//img[@alt='A Black Friday logo']"));
		File source= w.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\ss\\element.png");
		source.renameTo(dest);*/
		
	   WebElement w=driver.findElement(By.xpath("//button[@aria-label='Prices in Indian Rupee']"));
	   File source= w.getScreenshotAs(OutputType.FILE);
	   File dest= new File("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\ss\\specific.png");
	   source.renameTo(dest);
		
	}

}
