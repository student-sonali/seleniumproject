package seleniumpractice;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostStrapDropdown {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect ')]")).click();
		//select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//cature all the options and find the size
	List<WebElement> options= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	System.out.println(options.size());
	    
		//printing the options from dropdown
	/*for(WebElement op:options) 
	{
		System.out.println(op.getText());
	}*/
	
	//select  multiple options
	for(WebElement op:options) 
	{
		if(op.getText().equals("C#")|| op.getText().equals("Oracle")|| op.getText().equals("Python"))
        {
			op.click();
        	
        }
	}

	}

}
