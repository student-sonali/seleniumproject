package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		String ss=driver.findElement(By.id("nseindex")).getText();
		System.out.println(ss);
		

	}

}
