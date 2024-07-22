package com.tnsif.Day16;
/*
 * Interface: Blueprint for the class
 * inside we define the method
 * interface name_of_interface 
 * {
 * 		Static, Final, abstract methods, and Concrete, Default
 * }
 * Functional interface has only 1 abstract method
 * it is also known as SAM - Single Abstract Method
 * The method is called functional method
 * along with that static and default methods can be added to method
 * Ex: Runnable, ActionListener, 
 * 
 * Ex: 	interface name_of_interface 
 * 		{
 * 			public void display();
 * 		}
 * 		public class Driver implements name_of_interface
 * 		{
 * 			@Override
 * 			public void display()
 * 			{
 * 				SOP("TNSIF");
 * 			}
 * 		} 
 * 
 * Lambda expression: It is block of statement returns a result
 * syntax: (Arguments) => {action}
 * It is block of code that encapsulates an expression or a series and return the result
 * allows single method anonomyous class 
 * 
 * Built in functional interface Category:
 * 1. Supplier: No argument and returns a result
 * 2. Consumer: It consumes or takes an argument and returns no result {java.util.function} (accept(), Consumer())
 * 3. Predicate: Takes arguments and returns true or false (test(), negate(), and(), or())
 * 4. Function: Takes arguments and returns another object {java.util.function} used in map (compose(), apply(), andThen())
 * 
 * Built in functional interface :  
All these  functional interface   package  called java.util.function 
This is categorized in 4 types .
Supplier -- >No arguments and returns result
Consumer-->Takes an argument  and returns no result  
Default method :  
accept()
Predicate--> Takes an argument and returns  true or false
Default method: 
test()
Function--->Takes an argument and returns another object.
Default method : 
apply()
 * 
 * */
public class Lambdademo 
{

	public static void main(String[] args) 
	{
			functionaldemo f=()->{
				return "Hello Tnsif";
			};
			
			System.out.println(f.show());
	}

}
