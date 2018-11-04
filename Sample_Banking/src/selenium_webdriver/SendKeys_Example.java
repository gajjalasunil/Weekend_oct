package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Example 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Location of editbox and enter characters into it
		driver.findElement(By.id("u_0_j")).clear();
		driver.findElement(By.id("u_0_j")).sendKeys("Newuser");
		
		
		/*
		 * In Webdriver sendkeys command allow user to pass 
		 *   << character sequence >>  and  <<keyboard shortcuts>>
		 */
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Webdriver",
		Keys.TAB,"Newuserwebdriver@gmail.com",
		Keys.TAB,"Newuserwebdriver@gmail.com",
		Keys.TAB,"Hello12345");
		
		
		//Select Dropdown option using sendkeys
		driver.findElement(By.id("day")).sendKeys("23");
		
		//Select Dropdown option using sendkeys
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
		
		//Select Dropdown option using sendkeys
		driver.findElement(By.id("year")).sendKeys("1990");
		
		/*
		 * Sendkeys command does't throw any exception on invalid options.
		 */
		
		
		
	}

}
