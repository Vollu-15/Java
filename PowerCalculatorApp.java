package LoopingStatements;

import java.util.Scanner;

public class PowerCalculatorApp {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		  System.out.print("enter the base:");
		  int base=scan.nextInt();
		  System.out.print("enter the exponent:");
		  int exponent=scan.nextInt();
		  
		  PowerCalculator p1=new PowerCalculator();
		  System.out.println(p1.power(base,exponent));

	}
	

}
