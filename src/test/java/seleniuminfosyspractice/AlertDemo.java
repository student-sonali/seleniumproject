package seleniuminfosyspractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//simple alert
	 //  driver.findElement(By.id("alertBtn")).click();
	   //driver.switchTo().alert().accept();
	   
		//confirmation alert
		//driver.findElement(By.id("confirmBtn")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		//prompt alert
		driver.findElement(By.id("promptBtn")).click();
	Alert prompt=	driver.switchTo().alert();
	prompt.sendKeys("sonali");
	//prompt.accept();
	prompt.dismiss();

	   Thread.sleep(5000);
		

	}

}
