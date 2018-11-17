package global_variable;

import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Repository {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		//Create objcet for class
		Repository obj=new Repository();
		obj.driver=new ChromeDriver();
		
		//Get global variable
		obj.url="http://gmail.com";
		obj.load_Webpage();
		
		//Get global variables
		obj.signin_email="qadarshan@gmail.com";
		obj.Email_validation();
		
		//Get Global variables
		obj.signin_pwd="hello12345";
		obj.Password_validation();
		
	}

}
