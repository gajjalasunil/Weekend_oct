package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_WebDriver 
{

	public static void main(String[] args) 
	{
	
		//Set Environment path to chromedriver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//launch chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_j")).clear();
		driver.findElement(By.id("u_0_j")).sendKeys("Newuser");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("WEbdriver");
		
	}

}
