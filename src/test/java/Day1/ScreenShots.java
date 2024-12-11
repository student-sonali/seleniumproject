package Day1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot sc= (TakesScreenshot) driver;
	  /*  File source=sc.getScreenshotAs(OutputType.FILE);
	    File dest= new File( System.getProperty("user.dir")+"\\screenshot111\\ fullpage.png");
	    source.renameTo(dest);*/
	    
	 /*   WebElement w= driver.findElement(By.xpath("//header[@class='_3EOQ5Q']"));
	    File source=w.getScreenshotAs(OutputType.FILE);
	    File dest= new File(System.getProperty("user.dir")+"\\screenshot111\\specific part.png");
	    source.renameTo(dest);*/
		
	    WebElement w=driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
	    File source= w.getScreenshotAs(OutputType.FILE);
	    File dest= new File(System.getProperty("user.dir")+"\\screenshot111\\specific element.png");
	    source.renameTo(dest);

	}

}
