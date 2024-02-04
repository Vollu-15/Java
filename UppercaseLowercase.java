package controlconstructs;

import java.util.Scanner;

public class UppercaseLowercase {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the character:");
		char ch=scan.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Character is Uppercase");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Character is Lower case");
		}
		else
		{
			System.out.println("It is a number");
		}
	}

}
