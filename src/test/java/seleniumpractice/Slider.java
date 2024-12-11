package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
        WebElement	min_slider=	driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        
        System.out.println("Default location of slider"+min_slider.getLocation()); //(86,255)=(x,y)
        act.dragAndDropBy(min_slider, 200, 255).perform();
        
        System.out.println("After moving location of slider"+ min_slider.getLocation());
	

	}

}
