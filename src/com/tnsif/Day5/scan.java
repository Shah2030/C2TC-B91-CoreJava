package com.tnsif.Day5;
import java.util.Scanner;
public class scan {
	public static void main(String args[])
	{
	 @SuppressWarnings("resource")
	Scanner input= new Scanner(System.in); System.out.println("Enter your name: "); 
	 String n= input.nextLine(); //A line of string
	 System.out.println("Hello " + n);
	 System.out.println("Enter a character: ");
	 char num=input.next().charAt(0);
	 System.out.println("Char: "+num);
	 System.out.println(input.hasNext());
	}
}
