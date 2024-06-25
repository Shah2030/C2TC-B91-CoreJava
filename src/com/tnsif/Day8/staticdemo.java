package com.tnsif.Day8;
/*
 * static is used for memory management
 * single copy storage
 * static defined inside a class is called static member
 * 
 * feature:
 * can declare inner class with static
 * it is applicable to all members of class
 * it gets only memory when loaded
 * it can be accessed within static or non static class
 * 
 * */
//program to demonstrate static
public class staticdemo 
{
	static int b=200;// static variable
	int c=300;//global or instance variable
	public static void main(String[] args) 
	{
		/*
		int a=100; //local variable - inside only the method(main)
		System.out.println("Local Variable: "+a); */
		
		staticdemo s=new staticdemo();
		System.out.println("Static variable: "+s.b);
		
		//Direct access i.e, access with class
		System.out.println(staticdemo.b);
	}

}

