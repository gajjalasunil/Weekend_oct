package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_with_Dynamic_timeout 
{

	public static void main(String[] args) 
	{

		//launch browser and load webpage
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//Enter Email into Editbox and press enter key
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		
		//Set explicit timeout to wait until object visible at webpage
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("password")));
		
		//Identify password editbox and press enter key
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello1234",Keys.ENTER);
		

	}

}
