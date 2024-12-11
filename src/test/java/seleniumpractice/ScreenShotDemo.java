package seleniumpractice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotDemo {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//Take screenshot of full page
		TakesScreenshot as=( TakesScreenshot) driver;
	   /* File source=as.getScreenshotAs(OutputType.FILE);
	    File target= new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
	    source.renameTo(target);*/
		
	    //capture ss as specific area of page
	/*WebElement ff=	driver.findElement(By.xpath("//div[@class='demo-wrapper']"));
	 File source=ff.getScreenshotAs(OutputType.FILE);
	 File target=new File(System.getProperty("user.dir")+"\\screenshot\\specific.png");
	 source.renameTo(target);*/
		
		//Ss of specific element
		WebElement gg=driver.findElement(By.linkText("Multiple File Upload Input"));
	     File source=gg.getScreenshotAs(OutputType.FILE);
	     File target= new File(System.getProperty("user.dir")+"\\screenshot\\elementspecific.png");
	     source.renameTo(target);

	}

}
