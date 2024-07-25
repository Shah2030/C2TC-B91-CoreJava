package com.tnsif.Day17;

public class stringbuffer 
{

	public static void main(String[] args) 
	{
		StringBuffer b=new StringBuffer("Hello");
		System.out.println("Buffer: "+b);
		System.out.println("Length: "+b.length());
		System.out.println("Capacity: "+b.capacity());
		
		//Appending
		
		String s;
		int a=42;
		b=new StringBuffer(40);
		s=b.append("a =").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(b);
	}

}
