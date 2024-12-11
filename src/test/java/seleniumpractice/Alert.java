package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	    //simple alert with ok button
		/*driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();*/
		
		//confirmation alert-ok and cancel button
		/*driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();*/
		
		//prompt alert- input box
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Thread.sleep(5000);
	org.openqa.selenium.Alert prompt = driver.switchTo().alert();
	
		prompt.sendKeys("sonali");
		Thread.sleep(5000);
	//	prompt.accept();
		prompt.dismiss();
		//driver.close();
	 

	}

}
