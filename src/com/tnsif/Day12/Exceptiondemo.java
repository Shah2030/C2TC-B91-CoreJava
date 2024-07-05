package com.tnsif.Day12;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * It is used in testing
 * 
 * Exception: Disturbing the normal flow of execution
 * To handle Exceptions we have 5 key words:
 *  Try: Critical Statement,It might throw exception,Exception Generated block try{#code}
 * 	Catch: Catches and handles exception,Exception Handler block, catch(Exception e){#code}
 *  Finally: Used to close the connection, Optional,Freeing the resources, Cleaning code, Closing connection, Terminating Thread,  finally{#code}
 *  Throw: Used to throw built-in or customized exception(user defined Exception), used in try block, Syntax: {throw Exception_Name;}
 *  		it can be used inside a method, unchecked exception, followed by instance VAR.
 *  Throws: It is a method declaration, caller method takes responsibility of handling the exception, checked exception, followed by class 
 *  		Syntax:
 *  			access_specifier return_type method_name(Parameter list) throws exception
 *  			{
 *  				//body of the method
 *  			}	
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
 * 
 * User-defind exception:
 * derives base Exception class
 * user can create his own exception
 * used to provide higher level of abstraction and readability
 * 
 * Advantages:
 * Error free
 * used to fix error
 * used to handle and manage exception
 * used to terminate automatically
 * 
 * EX: web form, OS {in order to come over Deadlock, crash and recovery}, Internet Communication, Database Connection
 * 
 * 
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
