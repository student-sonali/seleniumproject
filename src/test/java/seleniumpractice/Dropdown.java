package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//by using select class
		 WebElement ss=driver.findElement(By.id("country"));
		 Select drop=new Select(ss);
		//drop.selectByIndex(4);
		//drop.selectByVisibleText("India");
		drop.selectByValue("uk");
		
	System.out.println(drop.isMultiple());
	
	//capture the options from the dropdown
      List<WebElement> ops=	drop.getOptions();
      System.out.println(ops.size());
      
      //printing that options
      for(WebElement ll:ops) 
      {
    	System.out.println(ll.getText());
      }
		
		

	}

}
