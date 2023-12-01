package Logical_Code;

public class Check_Lower_UpperCase_Letter_And_Counts 
{
//	 This for find out lower and upper case letters
// public static void main(String[] args)
// {
//	String s = "Welcome To AutoMatiOn";
//	String lower = "";
//	String upper = "";
//	
//	for(int i=0; i<s.length();i++)
//	{
//		char ch = s.charAt(i);
//		if(ch>65 &&ch<=90) 
//		{
//		  upper=upper+ch;	
//		}
//		else 
//		{
//		   lower=lower+ch;	
//		}
//	}
//	
//	System.out.println(lower);
//	System.out.println(upper);
// }
//********************************************************
// This is for Counts
 
	public static void main(String[] args) 
	{
		 String s = "Welcome To autoMatiOn";
			int lower = 0;
			int upper = 0;
			
			for(int i=0; i<s.length();i++) 
			{
				char ch = s.charAt(i);
				if(ch>65 && ch<=90) 
				{
				   upper++;	
				}
				else 
				{
					lower++;
				}
			}
			
			System.out.println("Lower : "+ lower);
			System.out.println("Upper : "+ upper);
	}
   
  
}
