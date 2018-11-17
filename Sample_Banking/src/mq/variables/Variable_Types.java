package mq.variables;

public class Variable_Types 
{
	
	String toolname="Selenium";  //Instant Variable [Define inside class outside method]
	static String email="qadarshan@gmail.com"; //Class variable
	
	public void method1()
	{
		String name="Webdriver";  //Local variable [Define inside method]
	}
	
	public void method2()
	{
		System.out.println(toolname); //Printing global variable
	}
	
	public static void main(String[] args) 
	{
		/*
		 *  We should created object to call instant variable from
		 *  main method.
		 *  		classname obj=new classname();
		 *  		obj.variablename;
		 */
		Variable_Types obj=new Variable_Types();
		String tname=obj.toolname;
		System.out.println("Instant Variable name is => "+tname);

		
		/*
		 * Calling Class variables [Variable with static specifier]
		 * 		
		 */
		String mail=email;
		System.out.println("static variable value is => "+mail);
	}

}
