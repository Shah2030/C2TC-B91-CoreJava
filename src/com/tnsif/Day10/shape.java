package com.tnsif.Day10;

public class shape{
	shape(float a)
	{
		System.out.println("Square with area: "+(a*a));
	}
	shape(float a,float b)
	{
		System.out.println("Rectangle with area: "+(a*b));
	}
	shape()
	{
		System.out.println("Default Shape");
	}
	public static void main(String[] args) 
	{
		shape s1=new shape();
		shape s2=new shape(10.5f);
		shape s3=new shape(10.5f,15.5f);
		
	}

}
