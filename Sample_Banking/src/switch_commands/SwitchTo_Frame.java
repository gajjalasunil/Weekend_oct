package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Switch to frame
		driver.switchTo().frame("modal_window");

		//Type text into email editbox
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("qadarshan@gmail.com");

		//Type text into editbox
		driver.findElement(By.id("tripidSecond")).clear();
		driver.findElement(By.id("tripidSecond")).sendKeys("646464");
		
		
		//Switch controls to mainpage
		driver.switchTo().defaultContent();
		
		//Click link at mainpage
		driver.findElement(By.linkText("Flights")).click();
		
	}

}
