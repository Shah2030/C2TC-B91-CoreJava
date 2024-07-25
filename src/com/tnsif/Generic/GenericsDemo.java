package com.tnsif.Generic;
/*
 * It is a mechanism where a single peace of code can manipulate many differentdata type without having seperate entity
 * allows us to create a single class, interface, and methods that uses different data type
 * type compatablity at the compile time
 * allows parameterized instances and passing by reference
 * function same no matter what data type is used
 * Collection such as ArrayLists uses generic extensively
 * these are declared in '<>'
 * 
 * Syntax:
 * 
 * class cn<t1,t2,..> 
 * {
 * 	//Generic type or paramiterized type
 * }
 * 
 * Generic class: class defined using the above
 * used to work upon objects
 * works on any kind of data type
 * */

class GC<T>
{
	T data;
	void set(T data)
	{
		this.data=data;
	}
	T get()
	{
		return data;
	}
}

class person
{
	String name,city;
	int age;
	person(String n,String c,int a)
	{
		age=a;
		city=c;
		name=n;
	}
	void get()
	{
		System.out.println("Name: "+name);
		System.out.println("City: "+city);
		System.out.println("Age: "+age);
	}
	
}

public class GenericsDemo 
{

	public static void main(String[] args) 
	{
		GC<String> ob=new GC<String>();
		ob.set("TNSIF");
		System.out.println(ob.get());

		GC<Integer> ob1=new GC<Integer>();
		ob1.set(10);
		System.out.println(ob1.get());
		
		person p=new person("ABCD","BGLOR",18);
		GC<person> ob2=new GC<person>();
		p.get();
	}

}
