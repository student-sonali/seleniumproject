package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes 
{
    public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
	    WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame); //passed frame as a webelement
		driver.findElement(By.name("mytext1")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		
		//frame 2
	    WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("selenium");
		driver.switchTo().defaultContent();
		
		//frame3
	    WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	    driver.switchTo().frame(frame3);
	    driver.findElement(By.name("mytext3")).sendKeys("Vivan");
	     
	    //inner iframe it is part of frame3

	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//div[@id='i8']")).click();
	    driver.findElement(By.xpath("//div[@id='i22']")).click();
		driver.switchTo().defaultContent();
		
		//frame4
       WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
       driver.switchTo().frame(frame4);
       driver.findElement(By.name("mytext4")).sendKeys("sonali");
       driver.switchTo().defaultContent();
		
       Thread.sleep(5000);
      // driver.close();
		
		
		
		
		

	}

}
