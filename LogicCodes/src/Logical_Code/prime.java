package Logical_Code;

public class prime 
{
  public static void main(String[] args)
  {
	  int num=68;
	  int count=2;
	  
	  for(int i=2; i<num;i++) 
	  {
		if(num%i==0)
		{	
			count++;
			break;
		}
	  }
		if (count==1)
		{
		   System.out.println("given no. is not prime no.");	
		}
		else 
		{
			System.out.println("given no. is prime no.");	
		}
	  }
	
}

