package global_variable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Repository 
{
	public WebDriver driver=null;
	public String url;
	public String signin_email;
	public String signin_pwd;
	
	
	public void load_Webpage()
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void Email_validation() throws InterruptedException
	{
		//Calling Locator from Gmail_locators class
		driver.findElement(Gmail_Locators.signin_email).clear();
		driver.findElement(Gmail_Locators.signin_email).sendKeys(signin_email+Keys.ENTER);
		Thread.sleep(5000);
	}
	
	public void Password_validation()
	{
		driver.findElement(Gmail_Locators.signin_pwd).clear();
		driver.findElement(Gmail_Locators.signin_pwd).sendKeys(signin_pwd+Keys.ENTER);
	}
	
	
}
