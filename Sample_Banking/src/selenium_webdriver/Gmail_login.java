package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login {

	public static void main(String[] args) throws Exception 
	{
		
		//launch browser and load webpage
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//Enter Email into Editbox and press enter key
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		Thread.sleep(4000);
		
		//Identify password editbox and press enter key
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello1234",Keys.ENTER);
		

	}

}
