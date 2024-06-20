package com.tnsif.Day4;

public class Base 
{
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void meDefault()
	{
		System.out.println("Default access base class");
		System.out.println("Default value: "+varDefault);
	}
	
	public void mePublic()
	{
		System.out.println("Public access base class");
		System.out.println("Public value: "+varPublic);
	}
	
	@SuppressWarnings("unused")
	private void mePrivate()
	{
		System.out.println("Private access base class");
		System.out.println("Private value: "+varPrivate);
	}
	
	protected void meProtected()
	{
		System.out.println("Protected access base class");
		System.out.println("Protected value: "+varProtected);
	}
	
}
