package Logical_Code;

public class Prime_no
{
	public static void main(String[] args) 
	{
		int num=7;
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1) 
		{
		 System.out.println("given no. "+num+" is Not prime no.");	
		}
		else
		{
			System.out.println("given no. "+num+" is prime no.");
		}
		
	}

}
