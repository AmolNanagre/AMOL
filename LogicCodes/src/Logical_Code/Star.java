package Logical_Code;

public class Star 
{
//	*
//	**
//	***
//	****
//	***
//	**
//	*
	public static void main(String[] args)
	{
		int star=1;                  // bcoz of in 1st row only one star present
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
			if(i<4)                  // for middle row no.
			{
				star++;
			}
			else 
			{
				star--;
				
			}
		}
		
		System.out.println("&&&&&&&&&&&");
		
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
		
		int Star = 5;
		for(int k=1;k<=9;k++) 
		{
		  for(int m=1;m<=Star;m++) 
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		  		
		if(k<5) 
		{
			Star--;
		}
		else 
		{
			Star++;
		}
	  }
		
		System.out.println("&&&&&&&&&&&");
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		int space=4;
		int logo=1;
		for(int p=1;p<=9; p++) 
		{
		  for(int q=1; q<=space;q++) 
		  {
			  System.out.print(" ");
		  }
		  for(int q=1; q<=logo; q++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		  
		  if(p<5) 
		  {
			  space--;
			  logo++;
		  }
		  else 
		  {
			  space++;
			  logo--;  
		  }		  
		}
		
		System.out.println("&&&&&&&&&&&");
		
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
		int gap=4;
		int icon=1;
		for(int x=1; x<=9; x++) 
		{
		  for(int y=1; y<=gap; y++)
		  {
			 System.out.print(" "); 
		  }
		  for(int y=1; y<=icon; y++) 
		  {
			 System.out.print("*"); 
		  }
		  System.out.println();
		 
		  
		  if(x<5)
		  {
			  gap--;
			  icon=icon+2;  
		  }
		  else 
		  {
			  gap++;
			  icon= icon-2;
		  }
		}		
	}
}
