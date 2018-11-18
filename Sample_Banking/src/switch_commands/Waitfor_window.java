package switch_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_window 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		//Wait for window
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.numberOfWindowsToBe(4));
		System.out.println("timeout released expected window is presented");
	}

}
