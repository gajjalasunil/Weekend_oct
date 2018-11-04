package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_and_partial_linktext 
{

	public static void main(String[] args) 
	{
		
		//launch browser and load webpage
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Note:--> use linktext only for anchor tag elements
		
		//Idnetify About us link with original linkname
		driver.findElement(By.linkText("About Us")).click();

		//Identify jobs link with original linkname
		driver.findElement(By.linkText("Jobs")).click();
		
		//Identify link  with original link name
		driver.findElement(By.linkText("Job Openings")).click();
		
		//Identify link with partial name
		driver.findElement(By.partialLinkText("Executive – Travel Facilitator (Implant)")).click();
		
		//Click link using partial linkname
		driver.findElement(By.partialLinkText("Back to Job openings")).click();
		
	}

}
