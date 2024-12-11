package Day1;

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
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Lenovo\\Desktop\\New folder (2)\\sonali.txt");
	if(	driver.findElement(By.id("fileList")).getText().equals("sonali.txt")) 
	{
		System.out.println("File upload");
	}
	else 
	{
		System.out.println("File not upload");
	}
		
		

	}

}
