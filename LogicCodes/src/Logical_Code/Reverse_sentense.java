package Logical_Code;

public class Reverse_sentense 
{
	public static void main(String[] args) 
	{
		String s1="my name Amol";
		String[] a1 = s1.split(" ");
		
		for (int i=a1.length-1; i>=0;i--) 
		{
			System.out.print(a1[i]+" ");
		}		
	}

}
