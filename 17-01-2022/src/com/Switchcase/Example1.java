package com.Switchcase;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{

		
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("enter any character :");
		String str=scanner.next();
		scanner.close();
		
		switch(str)
		{
		
		case"0":
		case"1":
		case"2":
		case"3":
		case"4":
		case"5":
		case"6":
		case"7":
		case"8":
		case"9":
		case"10":
			
			System.out.print("given character is number ");
			break;
		case"a":
		case"A":
		case"b":
		case"B":
		case"c":
		case"C":
		case"d":
		case"D":
		case"e":
		case"E":
		case"f":
		case"F":
		case"g":
		case"G":
		case"h":
		case"H":
		case"i":
		case"I":
		case"j":
		case"J":
		case"k":
		case"K":
			System.out.println("given character is alphabet");
			break;
			default:
				System.out.println("given character is special character");
			
			
		}
		
		
	}

}
