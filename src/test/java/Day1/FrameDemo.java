package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement w=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(w);
		driver.findElement(By.name("mytext1")).sendKeys("vivan");
		driver.switchTo().defaultContent();
		
	WebElement w1=driver.findElement(By.xpath("//[@frame='frame_3.html']"));
	driver.switchTo().frame(w1);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
	driver.switchTo().defaultContent();

	}

}
