package com.tnsif.Day16;

import java.util.Scanner;

interface fact
{
	public int factorial(int n);
}

public class work {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to find factorial: ");
		int n=s.nextInt();
		
		fact fa=(int num)->{
			for(int i=num-1;i>0;i--)
				num*=i;
			return num;
		};
		
		System.out.println("Factorial is: "+fa.factorial(n));
	}

}
