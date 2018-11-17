package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verfication_commands {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Capture runtime page title
		String Runtime_title=driver.getTitle();
		System.out.println("page title is => "+Runtime_title);
		
		
		//capture runtime page url
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("page url is => "+Runtime_url);
		
		//capture Runtime Window ID
		String Runtime_windowId=driver.getWindowHandle();
		System.out.println("Window Dynamic ID is => "+Runtime_windowId);
		
		//Capture runtime pagesource
		String Runtime_pageSource=driver.getPageSource();
		System.out.println("Runtime Source is => "+Runtime_pageSource);

	}

}
