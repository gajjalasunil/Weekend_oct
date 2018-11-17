package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_userInput_FromEditbox {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//IDentify Email edibtox
		WebElement Email_editbox=driver.findElement(By.id("email"));
		Email_editbox.sendKeys("9030248855");
		
		//Capture Userinput from editbox
		String Runtime_mobile_num=Email_editbox.getAttribute("value");
		if(Runtime_mobile_num.length()==10)
		{
			System.out.println("Accepted only 10 characters");
		}
		else
		{
			System.out.println("Accepted more than 10 characters");
		}
	}

}
