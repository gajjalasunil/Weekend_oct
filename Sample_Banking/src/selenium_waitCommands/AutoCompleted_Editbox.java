package selenium_waitCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoCompleted_Editbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Select Radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		//Identify Editbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		//Identify Editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
				
		//Select Date
		driver.findElement(By.linkText("22")).click();
		Thread.sleep(4000);
		
		//Click Next button at Datepicker
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("28")).click();
		
		//Identify Return date editbox
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Fri, 25 Jan, 2019");
		
		//Select adults dropdowns
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("2");
				
		//click Search button
		driver.findElement(By.id("SearchBtn")).click();
		
	}

}
