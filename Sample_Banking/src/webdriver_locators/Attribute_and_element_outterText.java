package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_and_element_outterText {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		/*
		 * HtmlSource:-->
		 * 
		 * 		<button  id="cjaMain"  > Create a Job Alert</button>
		 * 
		 * Element Text:-->
		 * 			//tagname[text()='Element text']
		 */
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		
		
		/*
		 * Element Attribute:-->
		 * 			//tagname[@ Attributename='Attributevalue']
		 */
		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).clear();
		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).sendKeys("Software Testing, ");
		Thread.sleep(3000);
		
		
		//using element text select option
		driver.findElement(By.xpath("//div[text()='Automation Testing']")).click();
		Thread.sleep(3000);
		
		//using element text select option
		driver.findElement(By.xpath("//div[text()='Selenium']")).click();
		Thread.sleep(3000);
				
		//using element text select option
		driver.findElement(By.xpath("//div[text()='Cucumber']")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		//using element text
		driver.findElement(By.xpath("//div[.='Appium']")).click();
		
		Thread.sleep(10000);
		driver.close();
		
		

	}

}
