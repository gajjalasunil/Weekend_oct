package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Option 
{

	public static void main(String[] args) 
	{
		
		
		//launch browser and load webpage
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		/*
		 * Create object for select class
		 * 
		 * packagename is :--> org.openqa.selenium.support.ui
		 */
		new Select(driver.findElement(By.id("open_account")))
		.selectByVisibleText("NRI Account");
		
		
		

	}

}
