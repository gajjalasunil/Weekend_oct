package selenium_webdriver.Dropdown;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Option_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		

		//launch browser and load webpage
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/credit-card/Index.aspx?");
		driver.manage().window().maximize();
		
		
		//Identify Dropdown element using select class and select option with visible option name
		new Select(driver.findElement(By.id("ddlCity")))
		.selectByVisibleText("DELHI");
		
		
		//Idnetify Dropdown and select option with index value
		Thread.sleep(4000);
		new Select(driver.findElement(By.id("ddlCity")))
		.selectByIndex(5);
		
		//IDentify dropdown and select option using value property
		Thread.sleep(4000);
		new Select(driver.findElement(By.id("ddlCity")))
		.selectByValue("INDORE");
		
		
		
		//IDentify dropdown IncomeDetails
		//Create object for Select class
		Select City_selector=new Select(driver.findElement(By.id("ddlIncome")));
		City_selector.selectByVisibleText("20000-25000");
		
		Thread.sleep(4000);
		City_selector.selectByIndex(4);
		
		Thread.sleep(4000);
		City_selector.selectByValue("65000 and above");
	}

}
