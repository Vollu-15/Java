package controlconstructs;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) 
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int a=scan.nextInt();
	  
	  if(a>0) 
	  {
		System.out.println("positive number"); 
	  }
	  else
	  {
		  System.out.println("negative number");
	  }
	}

}
