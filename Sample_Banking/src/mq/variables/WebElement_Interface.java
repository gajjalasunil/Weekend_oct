package mq.variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElement_Interface {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		//Identify location of email Editbox
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		
		//Identify location of password editbox and store into referral
		WebElement Password_Editbox=driver.findElement(By.id("pass"));
		Password_Editbox.clear();
		Password_Editbox.sendKeys("Hello123456");
		
		
		//Identify login button location
		By Login_button_locator=By.id("loginbutton");
		//Identify Location at webpage
		WebElement Login_button=driver.findElement(Login_button_locator);
		//click Login button
		Login_button.click();
		
		
		
		
	}

}
