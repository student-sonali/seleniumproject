package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	String	Actual_title=driver.getTitle();
	
	if(Actual_title.equals("Your Store")) 
	{
		System.out.println("Test pass");
	}
	else 
	{
		System.out.println("Test fail");
		
	}
	//driver.close();
	driver.quit();

	}

}
