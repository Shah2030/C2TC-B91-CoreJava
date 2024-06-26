package com.tnsif.Day9;
/*
 * static method can only call static not instance method of class
 * it will be stored in class memory
 * it can access only static members
 * cannot declare a method with same signature as instance method
 * only one copy will be created in the memory and shared by all objects present in the class
 * static method is loaded in memory before object is created
 * it can be overloaded but cannot be overridden
 * 
 * static block
 * its is declared with just static key word
 * it is always executed 1st while performing the execution
 * its is also known as static initilisation block of static
 * its always executed first
 * it cannot use this and super key
 * */
public class staticmethoddemo {
	static
	{
		System.out.println("Inside static block 1");
		staticmethoddemo s= new staticmethoddemo();
		System.out.println(s.a);
	}
	
	public staticmethoddemo() {
		System.out.println("Inside the class cunstructoer");
	}

	//the below block is instance block it is executed when object is created and beforre the cunstructor it will be executed
	{
		//instance block can use this key word
		System.out.println("Inside instance block 1 a object is created");
	}
	
	static
	{
	 System.out.println("Inside static block 2");
	}
	int a=10;

	public static void main(String[] args) {
		//The below is instance block
		{
			System.out.println("Inside Instance block 2 if object is created");
		}
	}

}
