package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProviderDemo1 
{
	/* women top
	 * Mens Bottom
	 * Gear Bags
	 */
	@DataProvider(name="searchdatakey")
	public Object[][] searchdata()
	{
		Object[][] ob=new Object[3][2];
		ob[0][0]= "Women";
		ob[0][1]= "Top";
		
		ob[1][0]= "Mens";
		ob[1][1]= "Bottoms";
		
		ob[2][0]= "Women";
		ob[2][1]= "Top";
		
		return ob;
	}
	
	
	
	@Test(dataProvider="searchdatakey")
	public void search(String catagory,String style)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	WebElement el=	driver.findElement(By.name("q"));
	el.sendKeys(catagory+""+style);
	el.submit();
	}

}
