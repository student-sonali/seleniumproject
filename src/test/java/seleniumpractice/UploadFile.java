package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Lenovo\\Desktop\\New folder (2)\\sonali.txt");
	/*if(	driver.findElement(By.xpath("//ul[@id='fileList']")).getText().equals("sonali.txt")) 
	{
		System.out.println("File is uploaded succesfully");
		
	}else 
	{
		System.out.println("Upload Failed");
	}
	*/
	//how to upload multiple files
		
String	file1=	"C:\\Users\\Lenovo\\Desktop\\New folder (2)\\sonali.txt";
String file2= "C:\\Users\\Lenovo\\Desktop\\New folder (2)\\sonali2.txt";
driver.findElement(By.xpath("//input[@type='file']")).sendKeys(file1+"\n"+file2);
     int nooffileuploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
     
     if(nooffileuploaded==2) 
     {
    	 System.out.println("Files uploaded succesfully");
     }else 
     {
    	 System.out.println("Upload failed");
     }
	}

}
