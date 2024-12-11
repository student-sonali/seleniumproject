package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChecbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all checkboxes on webpage
        List<WebElement> check=	driver.findElements(By.xpath("//input[@class='form-check-input' and @ type='checkbox']"));
		
	  /*  for(WebElement cc:check) 
	    {
		cc.click();
	    }*/
	    
	    //select last three chekboxes
        //formula- total no of checkboxes- how many checboxes want to select=staring index
        //7-3=4(starting index)
	  /*  for(int i=4; i<=check.size();i++) 
	    {
	    	check.get(i).click();
	    }*/
        
        // select first 3 checkboxes
       /* for(int i=0;i<3;i++) 
        {
        	check.get(i).click();
        }*/
		
        //unselect checkboxes if they are selected
        for(int i=0;i<3;i++) 
        {
        	check.get(i).click();
        }
        Thread.sleep(5000);
        for(int i=0;i<3;i++) 
        {
        	check.get(i).click();
        }
       System.out.println(check.size()); 
		

	}

}
