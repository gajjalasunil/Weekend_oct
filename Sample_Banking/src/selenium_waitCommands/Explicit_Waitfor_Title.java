package selenium_waitCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Waitfor_Title
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.fb.org");
		driver.manage().window().maximize();
		
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.titleIs("Selenium - Web Browser Automation"));
		System.out.println("title verified");
		
		
		
	}

}
