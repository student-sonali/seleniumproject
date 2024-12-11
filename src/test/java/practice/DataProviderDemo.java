package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo
{
	@DataProvider(name= "searchdataset")
	public Object[][] searchData()
	{
		Object [][] searchkeyword=new Object[3][2];
		searchkeyword[0][0]="India";
		searchkeyword[0][1]="Qutub Minar";
				
		searchkeyword[1][0]="Agra";
		searchkeyword[1][1]="Taj Mahal";
		
		searchkeyword[2][0]="Hyadrabad";
		searchkeyword[2][1]="Char Minar";
				
				return searchkeyword;
	}
	
	
	@Test(dataProvider="searchdataset")
	public void Testcasegooglesearch(String country ,String mounament) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	WebElement el=	driver.findElement(By.id("APjFqb"));
	el.sendKeys(country +" "+mounament);
	driver.findElement(By.name("btnK")).submit();
	
	}

}
