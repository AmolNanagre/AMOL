package Logical_Code;

public class No_of_Spaces_in_String 
{
	public static void main(String[] args)
	{
		String str = "a b  c  d e  f";
		int sum = 0;
		
		for(int i=0;i<=str.length()-1;i++) 
		
		{
			char chr=str.charAt(i);
			if (chr==' ')
			{
				sum++;
			}
			
		}
		System.out.println("no. of spaces in given string is:- "+sum);
		
	}

}
