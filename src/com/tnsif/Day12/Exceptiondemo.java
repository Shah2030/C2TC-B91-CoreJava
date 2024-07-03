package com.tnsif.Day12;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception: Disturbing the normal flow of execution
 * To handle Exceptions we have 5 key words:
 *  Try: Critical Statement,It might throw exception,Exception Generated block try{#code}
 * 	Catch: Catches and handles exception,Exception Handler block, catch(Exception e){#code}
 *  Finally: Used to close the connection, Optional,Freeing the resources, Cleaning code, Closing connection, Terminating Thread,  finally{#code}
 *  Throw:
 *  Throws:
 * 
 * Types of exceptions:
 * Checked  - Compile time
 * Unchecked - Runtime
 * 
 * Throwable {Exception(Checked, Unchecked), Error(StackOverFlow, VirtualMachineError, OutOfMemoryError)}
 * Checked{IO,SQL,ClasNotFound}
 * Unchecked{Arithmetic, NullPointer, IndexOutOfBound}
 *
 * Try Multiple catch block
 * Nested Try catch block -{}
 * Try is always followed by catch statement
 * only 1 Try block
 * */
public class Exceptiondemo {

	static void div(int a,int b)//Single try catch block
	{
		int z;
		try 
		{
			System.out.println("Inside the try block method");
			z=a/b;
			System.out.println("Division result: "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside Catch-Block method: "+e);
		}

	}
	static void mulcatchdiv() //Part of Try with Multiple catch block
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two numbers: ");
		try {
			a=s.nextInt();
			b=s.nextInt();
			c=a/b;
			System.out.println("Result: "+c);
		}
		catch(InputMismatchException I)
		{
			System.out.println("Input Miss Match Exception");
		}
		catch(ArithmeticException A)
		{
			System.out.println("Arithmetic Exception");
		}
		s.close();
	}
	static void finallydiv(int a,int b) {
		int c;
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Inside the try block");
			c=a/b;
			System.out.println("Result: "+c);
		}
		catch(ArithmeticException A)
		{
			System.out.println("Arithmetic Exception "+A);
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("");
	}
	public static void main(String[] args) 
	{	
		System.out.println("Inside the main method\n");
		//div(0,0);
		finallydiv(12,3);
		finallydiv(5,0);
		//mulcatchdiv();
		System.out.println("End of the main method");
	}
}
