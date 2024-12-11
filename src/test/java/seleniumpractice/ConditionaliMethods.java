package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionaliMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		
		//isDisplayed() method
	WebElement ee=	driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
	 boolean image=ee.isDisplayed();
	 System.out.println(image);
	 
	 //isEnabled() method
	 
	boolean ss=driver.findElement(By.name("FirstName")).isEnabled();
	System.out.println(ss);
    
	//isSelected() method
	
	WebElement dd=driver.findElement(By.id("gender-male"));
	System.out.println(dd.isSelected());
	dd.click();
	System.out.println(dd);
	
	WebElement xx=driver.findElement(By.id("gender-female"));
	xx.isSelected();
	xx.click();
	System.out.println(xx);
	Thread.sleep(5000);
	
	driver.quit();
	}

}
