package com.tnsif.Day9;
/*
 * provides primitive data types converted to objects
 * char -> Character
 * byte -> Byte
 * short -> Short
 * int -> Integer
 * long -> Long
 * float -> Float
 * 
 * Wrapper obj = new Wrapper(val); where Wrapper can be any of right listed above and part of wrapping process to wrap an primitive to obj
 * datatype var=obj.datatypeValue(); used in unwrapping
 * 
 * use of Wrapper:
 * when need an object
 * java.util handle only objects
 * Collection framework -> ArrayList stores only the object
 *   
 * */
public class wrapperclassdemo {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer obj=new Integer(105); // wrapping
		System.out.println(obj instanceof Integer); //checking instance of class
		int b=obj.intValue(); // unwrapping
		obj=10; // Mutable value
		int c=obj;
		System.out.println(c+b);
		@SuppressWarnings("removal")
		Long l=new Long(1000000000);
		//int n=l;
		//System.out.println(n);
		//Note: lower to higher it can be converted but not higher to lower data type using auto unboxing as shown above

	}

}
