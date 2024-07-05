package com.tnsif.Day12;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	//Class to demonstrate user defined exception
	InvalidAgeException()
	{
		super("Invalid age");
	}
	InvalidAgeException(String message)
	{
		super(message);
	}
}

public class throwdemo 
{
	//Main class
	
	static boolean isAgeValid(int age)
	{
		return age>=18;
	}
	static void validateAge(int age) throws InvalidAgeException
	{
		if(!isAgeValid(age))
			throw new InvalidAgeException("Invalid age!, You are not eligibal to vote");	
		
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your age: ");
		while(!s.hasNextInt())
		{
			System.out.println("Invalid Input, Enter a valid input for age");
			s.next();
		}
		int age=s.nextInt();
		try {
			validateAge(age);
			System.out.println("Welcome to vote");
		}
		catch(InvalidAgeException e)
		{
			e.getMessage();
		}
		finally
		{
			s.close();
		}

	}

}
