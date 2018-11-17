package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Title 
{

	public static void main(String[] args) 
	{
		
	
		/*
		 * Testcase:--> Verify seleniumhq Homepage
		 * Steps:-->
		 * 			launch chrome browser
		 * 			load seleniumhq webpage
		 * Expected:-->
		 * 			System should display homepage with Unique title
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		
		String Exp_title="Selenium - Web Browser Automation";
		//Capture runtime title
		String Act_title=driver.getTitle();
		
		
		//Verify EqualIgnorecase comparision between two Strings
		boolean flag=Exp_title.equalsIgnoreCase(Act_title);
		System.out.println("SeleniumHQ homepage title status is  --> "+flag);
		
		
		//Write decision statement 
		if(flag==true)
		{
			System.out.println("Expected Title presented for homepage");
			
			//Verify Projects tab--> Expected:--> should display unique title for project page
			WebElement projects_tab=driver.findElement(By.linkText("Projects"));
			projects_tab.click();
			
			//Writing nested if condition to verify title presented
			if(driver.getTitle().equals("Selenium Projects"))
				System.out.println("Expected project page displayed");
			else
				System.out.println("Expected project page not displayed");
		}
		else
		{
			System.out.println("Wrong title presented for homepage");
		}
		

	}

}
