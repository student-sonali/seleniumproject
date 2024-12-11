package ppppselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\vivan\\vivi.txt");
		if(driver.findElement(By.xpath("ul[@id='fileList']")).getText().equals("vivi.txt"))
		{
			System.out.println("file uploaded");
		}else 
		{
			System.out.println("file not uploaded");
		}


	}

}
