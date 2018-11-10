package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeCss {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("form[class='XFYOY'] > div:nth-child(4)> div > div >input")).clear();
		driver.findElement(By.cssSelector("form[class='XFYOY'] > div:nth-child(4)> div > div >input")).sendKeys("Sample");

		driver.findElement(By.cssSelector("form[class='XFYOY'] > div:nth-child(5)> div:nth-child(1) > div:nth-child(1) >input")).clear();
		driver.findElement(By.cssSelector("form[class='XFYOY'] > div:nth-child(5)> div:nth-child(1) > div:nth-child(1) >input")).sendKeys("Sample");

		
		
		
	}

}
