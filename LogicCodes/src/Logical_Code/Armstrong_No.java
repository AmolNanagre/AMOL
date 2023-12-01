package Logical_Code;

public class Armstrong_No 
{
  public static void main(String[] args)
  {
	  int num=152;
	  
	  int sum=0;
	  
	  
	  for (int i=num; i>0; i=i/10) 
	  {
		 int rem = i%10; 
		 
		 sum=sum+(rem*rem*rem);
	  }
	
	  if(sum ==num) 
	  {
		  System.out.println("given no "+ num +" is Armstrong no.");
	  }
	  else 
	  {
		  System.out.println("Given no "+num+" is not Armstrong no.");
	  }
	  
}
}
