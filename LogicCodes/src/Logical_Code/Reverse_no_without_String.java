package Logical_Code;

public class Reverse_no_without_String
{
	public static void main(String[] args) 
	{
		int num=1234;
		int revnum=0;
		
		for(int i=num; i>0;i=i/10)
		{
			int rem = i%10;
			revnum=revnum*10+rem;
		}
		System.out.println(revnum);
		
	}

}
