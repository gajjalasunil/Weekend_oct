package switch_commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_Frame 
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
		
		
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		//Wait for Sign in button
		wait.until(ExpectedConditions.elementToBeClickable(By.className("login-btn"))).click();
		System.out.println("Timeout released Signin button clicked");
		
		//Wait for frame to available and switch to it
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("modalIframe")));
		System.out.println("Timeout released frame available at source");

		//Enter Mobile number
		driver.findElement(By.id("mobileNoInp")).clear();
		driver.findElement(By.id("mobileNoInp")).sendKeys("9030248855");
		
		//Get controls to mainpage
		driver.switchTo().defaultContent();
		
		//close button
		driver.findElement(By.cssSelector("div[id='login_frame'] div[title='close'][class='modalClose icon icon-cross']")).click();
		
		
	}

}
