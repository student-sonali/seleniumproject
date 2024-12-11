package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertWithoutusingSwitchTo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
     WebDriverWait wait= new  WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
	org.openqa.selenium.Alert aa=	wait.until(ExpectedConditions.alertIsPresent());
	Thread.sleep(5000);
	
      aa.accept();
	}

}
