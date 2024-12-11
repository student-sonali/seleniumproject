package seleniuminfosyspractice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ac= ( TakesScreenshot)driver;
	File source=	ac.getScreenshotAs(OutputType.FILE);
	File dest= new File(System.getProperty("user.dir")+"\\screenshot\\org.png");
	source.renameTo(dest);
		

	}

}
