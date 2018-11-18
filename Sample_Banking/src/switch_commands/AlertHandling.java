package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertHandling {

	public static void main(String[] args) throws Exception 
	{
		
		//Verify alert presented at webpage
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//Identify Search button location
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		//Search_btn.click();
		Thread.sleep(5000);
		
		//Write decision statement to confirm alert window presented
	    if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	    {
	    	System.out.println("Alert presented");
	    	
	    	//switch to alert
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert
			String Alert_msg=alert.getText();
			System.out.println(Alert_msg);
			
			//Close alert 
			alert.accept();
	    }
	    else
	    {
	    	System.out.println("Alert not presented");
	    }
		
		
		
		
		
		
		
		
		//Decision statement avoid  "NoAlertPresented"  Exception

	}

}
