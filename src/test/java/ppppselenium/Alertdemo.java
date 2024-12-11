package ppppselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("alertBtn")).click();
		driver.switchTo().alert().accept();*/
		
	/*	driver.findElement(By.id("confirmBtn")).click();
	Alert aa=	driver.switchTo().alert();
	aa.dismiss();*/
		
		driver.findElement(By.id("promptBtn")).click();
		Alert aa=driver.switchTo().alert();
		aa.sendKeys("sonali");
		aa.accept();
		

	}

}
