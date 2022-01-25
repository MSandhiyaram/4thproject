package com.IfElse;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{

		
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("enter any character :");
		char ch=scanner.next().charAt(0);
		scanner.close();
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
	
		   
		
			System.out.print( ch +   "  is a ALPHABET ");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println( ch +   "  is a NUMBER/DIGIT");
		}
		else
		{
				System.out.println( ch +   "  is a SPECIAL CHARACTER");
		}
			
		System.out.println("*****************************");	
		
		
		
	}

}
