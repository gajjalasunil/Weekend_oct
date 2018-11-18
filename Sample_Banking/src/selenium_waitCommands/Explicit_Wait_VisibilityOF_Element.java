package selenium_waitCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_VisibilityOF_Element 
{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify Location
		WebElement Multicity=driver.findElement(By.xpath("//label[text()='multi-city']"));
		Multicity.click();
		
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addModifyBtn"))).click();
		System.out.println("AddCity button visible and get clicked");
		
		
		
		//Select Round Trip
		WebElement Roundtrip=driver.findElement(By.xpath("//label[text()='round trip']"));
		Roundtrip.click();
		
		
		//Wait for Elemen to invisible at webpage
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("addModifyBtn")));
		System.out.println("Element invisible at webpage");
		
		
		

	}

}
