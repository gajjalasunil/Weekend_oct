package mq.variables;

public class String_Comparision_Methods {

	public static void main(String[] args) 
	{
		/*
		 * String is not only a datatype and also called as class.
		 * String class contains set of events to validate set of Characters
		 * behaviour.
		 */
		
		String exp_result="created account";
		String act_result="Created Account";
		
		/*
		 * equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 */
		boolean flag=act_result.equals(exp_result);
		System.out.println("Equal Comparision is  ==> "+flag);
		
		
		/*
		 * EqualIgnorecase:-->
		 * 		Method verify equalignorecase comparision between
		 * 		two string and return boolean value true/false.
		 */
		boolean flag2=act_result.equalsIgnoreCase(exp_result);
		System.out.println("Ignorecase comparision is ==> "+flag2);

		
		
		String Status="Account 100 Create Successfull";
		/*
		 * contains:-->
		 * 		Method verify subString availability at main String
		 */
		boolean flag1=Status.contains("100");
		System.out.println("sub String available status ==> "+flag1);
		
		
		/*
		 * length:-->
		 * 		Method return charactes length available at String
		 */
		String mobile_num="9030248855";
		int len=mobile_num.length();
		System.out.println("Verify mobile length available => "+len);
		
		
		/*
		 * subString:-->
		 * 		Get sub String from main string
		 */
		String Account_num="1245875451552154";
		String sub=Account_num.substring(12);
		System.out.println("last 4 digit numbers in accoutn num ==> "+sub);
		
		String sub1=Account_num.substring(8, 12);
		System.out.println("middle charaters ==> "+sub1);
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify String emtpy status  and return boolean value.
		 */
		String var="hello";
		String var1="";
		System.out.println("var Empty status is => "+var.isEmpty());
		System.out.println("var1 Empty status is => "+var1.isEmpty());
		
		
		/*
		 * trim:--> Trim extra spaces
		 */
		String Mobile_num="   9030248855    ";
		System.out.println("Mobile nUmber length before trim is => "+Mobile_num.length());
		
		String New_mobile_num=Mobile_num.trim();
		System.out.println("Mobile number length after trim is => "+New_mobile_num.length());
		
		
		
		
		
		
	}

}
