package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		/*driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total no of images:" + images.size() );
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[5]/div/div/span/span")).click();*/
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//using linktext
	//	driver.findElement(By.linkText("Mobiles & Tablets")).click();
		
		//using text()method
		driver.findElement(By.xpath("//*[text()=\"Mobiles & Tablets\"]")).click();
		
		//using text method
		//driver.findElement(By.xpath("//*[text()='Premium Products']")).click();
		
		//chained xpath
	//boolean status=	driver.findElement(By.xpath("//div[@class=\"_16ZfEv\"]/a/picture/img")).isDisplayed();
	//System.out.println(status);
		driver.findElement(By.xpath("//div[@class=\"YT6Bra\"]/div/img")).click();
		
		
		Thread.sleep(5000);
		
		
		//driver.quit();

	}

}
