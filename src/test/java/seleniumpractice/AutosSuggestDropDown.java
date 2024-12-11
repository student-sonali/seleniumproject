package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosSuggestDropDown {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		
		//options from dropdown
	    List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	    System.out.println(options.size());
	
	    //printing options
	    for(int i=0;i<=options.size();i++) 
	    {
         System.out.println(options.get(i).getText());
         
         //select one option from dropdown
         if(options.get(i).getText().equals("selenium webdriver"))
         {
        	 options.get(i).click();
        	break;
         }
   
		
	    }
		
		
		

	}

}
