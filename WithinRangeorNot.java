package controlconstructs;

import java.util.Scanner;

public class WithinRangeorNot
{

	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.print("enter the Number");
	  int a=scan.nextInt();
	  
	  if(a<=10)
	  {
		  System.out.println("Range 1");
	  }
	  else if(a<=20)
	  {
		  System.out.println("Range 2");
	  }
	  else if(a<=30)
	  {
		  System.out.println("Range 3");
	  }
	  else if(a<=40)
	  {
		  System.out.println("Range 4");
	  }
	  else if(a<=50)
	  {
		  System.out.println("Range 5");
	  }
	  
	  else
	  {
		System.out.println("Outside range"); 
	  }
	}

}
