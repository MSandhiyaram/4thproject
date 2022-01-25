package com.Conditionalloops;

import java.util.Scanner;

public class Example3 
{

	public static void main(String[] args) 
	{
     
		int start, end;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter start value: ");
		start = scanner.nextInt();
		
		System.out.println("Enter end value: ");
		end = scanner.nextInt();
		
		System.out.println("***********************");
		
		for(int i = start; i <= end; i++)
		{
			System.out.println(i);
			
		}
		
		scanner.close();

		
		
		
	}

}
