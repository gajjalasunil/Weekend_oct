package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Multiple_Dropdown_Selection {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		//Identify Dropdown location and verify selection type
		boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown Multiple selecton state is => "+flag);
		
		
		//Using javascript convert to multiple selection dropdown
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		//Identify Dropdown location and verify selection type
		boolean flag1=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown Multiple selecton state is => "+flag1);
		
		//Accept multiple selection only when it was combobox..
		if(flag1==true)
		{
			System.out.println("Testpass dropdown is a multiple selection type");
			Select Open_account=new Select(driver.findElement(By.id("open_account")));
			Open_account.deselectAll();  //Deselect option only work on multiple selection type
			Open_account.selectByIndex(2);
			Open_account.selectByIndex(3);
			Open_account.selectByIndex(4);
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		

	}

}
