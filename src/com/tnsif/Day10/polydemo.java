package com.tnsif.Day10;
/*
 * One thing exhibiting more than 1 form
 *Types:
 *Compile time -> static and early binding {Overloading->(Method, Constructor , Operator[implicitly '+' by JVM ])}
 *Run time -> Dynamic and late binding {Overriding ->(Method Overriding)}
 *
 *Same functionality but different logic
 *
 *features:
 *functionality behaves different in different scenario
 *same name with different type
 *Implicit type convention
 *
 *Advantage:
 *Code reusability
 *reduces the coupling
 *Supports single var name
 *
 *Disadvantages:
 *Reduces readability of code
 *it is little challenging to implement
 *
 *Constructor:{More than one constructors with same but different parameter list}
 *constructor should be part of class not main().
 *
 *In class hierarchy parent method is overridden by child class 
 *
 *Rules:
 *return types must be same
 *same parameters must be same
 *permission must not be reduces
 *permission can be same or in the increasing order
 *final method cannot be overridden
 *static methods cannot be overrided
 * */
class mo
{
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static float add(float a, float b)
	{
		return a+b;
	}
	public static float add(float a, int b)
	{
		return a+b;
	}
	public static String add(String a, String b)
	{
		return a+b;
	}
}

public class polydemo {
 
	public static void main(String a[])
	{
		System.out.println("Add of int: "+mo.add(10,20));
		System.out.println("Add of Float: "+mo.add(10.5f,20.5f));
		System.out.println("Add of float & int: "+mo.add(10.9f,20));
		System.out.println("Add of String: "+mo.add("Abcd","Efgh"));
	}
}
