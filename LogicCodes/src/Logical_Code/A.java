package Logical_Code;

import java.util.Scanner;

public class A 
{
	 
	public static void main(String[] args) 
  {    int rows = 5; 
	
	
	for(int i = 1; i <= rows; ++i) 
	{
		for(int j = 1; j <= i; ++j) 
	
	    { System. out. print(j + " ");
	    }
		System.out.println();
		rows=rows++;
	}

  }
	public static void main1(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1+num2);
		
	}
}

