package seleniuminfosyspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
	WebElement ff=	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(ff);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("sonali");
	driver.switchTo().defaultContent();
		

	}

}
