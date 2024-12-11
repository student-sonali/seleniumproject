package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButtons {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
  List <WebElement> rblist= driver.findElements(By.xpath("//input[@type='radio']"));
 System.out.println("Total no of radio buttons:" +  rblist.size()); 
 
 driver.close();
	}

}
