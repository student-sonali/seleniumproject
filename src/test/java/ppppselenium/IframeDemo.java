package ppppselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
	   WebElement w=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	   driver.switchTo().frame(w);
	   driver.findElement(By.name("mytext1")).sendKeys("vivan");
	   driver.switchTo().defaultContent();
	   
	  WebElement w1= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  driver.switchTo().frame(w1);
	  driver.findElement(By.name("mytext2")).sendKeys("mahesh");
	   driver.switchTo().defaultContent();

	   
	   WebElement w2= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	   driver.switchTo().frame(w2);
	   driver.findElement(By.name("mytext3")).sendKeys("sonali");
	   
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
	   driver.switchTo().defaultContent();
	   
	   WebElement w3= driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		  driver.switchTo().frame(w3);
		  driver.findElement(By.name("mytext4")).sendKeys("mummy");
		   driver.switchTo().defaultContent();

	}

}
