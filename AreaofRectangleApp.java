package LoopingStatements;

import java.util.Scanner;

public class AreaofRectangleApp {

	public static void main(String[] args)
	{

		Scanner scan=new Scanner(System.in);
		  System.out.print("enter the length of the rectangle:");
		  double a=scan.nextDouble();
		  System.out.print("enter the width of the rectangle:");
		  double b=scan.nextDouble();
		  
		  AreaofRectangle A1=new AreaofRectangle ();
		 System.out.println(A1.calculateRectangleArea(a,b));

	}

}
