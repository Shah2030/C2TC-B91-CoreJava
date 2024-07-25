package com.tnsif.Day17;
/*
 * Strings: It is character array enclosed within the double quotes
 * String[] a="ABCD"; ==
 * Permeative: String Ob= "val";
 * Object Type: String a=new String("val");
 * Reference:  String b=new String(a);
 * 
 * Methods:
 * length
 * toUpperCase
 * toLowerCase
 * 
 * if no new operator is used then it will be stored in String Pool memory 
 * String Pool memory is present in heap
 * heap memory is present in JVM memory
 * 
 * Heap -> new key word
 * string constant pool -> no new keyword -> if already existing then points to same memory
 * JVM -> handles memory or manages memory
 * 
 * String Buffer: 
 * It is a class which creates flexible length
 * it is mutable 
 * it is declared as final
 * Syntax:
 * StringBuffer b=new StringBuffer({null, int capacity, direct String});
 * 
 * Methods():
 * Append
 * capacity
 * indexOf
 * length
 * delete
 * deleteCharAt
 * reverse
 * trimToSize
 * 
 * 
 * Advantages:
 * mutable
 * fast
 * less memory
 * concat strings
 * does not override equals()
 * 
 * 
 * String pool is memory in the  where string objects are stored
 * */
public class strings 
{

	public static void main(String[] args) 
	{
		String s1=new String(" Indian  ");
		String s2=" Indian  ";//s1.strip();
		String s3=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.substring(3));
		System.out.println(s1.equals(s2));//same 
		System.out.println(s1==s2);//Reference
		System.out.println(s1.compareTo(s3));
		

	}

}
