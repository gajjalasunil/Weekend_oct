package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		//Launch browser window and load webpage
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Get Dynamic WIndow ID
		String MainWindow_ID=driver.getWindowHandle();
		System.out.println("Dynamic Window ID is => "+MainWindow_ID);
		
	
		//Click External link to open private window.
		driver.findElement(By.linkText("Instagram")).click();
		Thread.sleep(5000);
		
		
		//Capture all Window Dynamic ID's
		Set<String> Allwindows=driver.getWindowHandles();
		
		//Implement foreach
		for (String Eachwindow : Allwindows) 
		{
			driver.switchTo().window(Eachwindow);
		}
		
		System.out.println("Current window title is => "+driver.getTitle());
		
		//Enter text at Instagram window
		WebElement Mobile_or_email=driver.findElement(By.cssSelector("input[aria-label='Mobile Number or Email']"));
		Mobile_or_email.clear();
		Mobile_or_email.sendKeys("9030248855");
		Thread.sleep(5000);
		
		
		//Switch controls back to mainpage
		driver.switchTo().window(MainWindow_ID);
		System.out.println("Mainwindow title is => "+driver.getTitle());
		
		
	}

}
