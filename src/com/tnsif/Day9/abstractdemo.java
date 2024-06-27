package com.tnsif.Day9;
/*
 * it is non access modifier
 * applicable for incomplete class
 * creating sub class is compulsory for abstract class
 * non-abstract class is called as concrete class
 * it is not applicable for var
 * abctract can also have non abstract methods
 * cannot create objects for abstract class
 * used to share and make program more flexible
 * need to know the usage but not the functionality
 * */

//program to demonstrate abstract
abstract class shape
{
	protected float area;
	//abstract method
	abstract void calArea();
	void show()
	{
		System.out.println("Area of the shape: "+this.area);
	}
}

class square extends shape
{
	private float side;
	public square()
	{
		side=0.2f;
	}
	
	public square(float side) 
	{
		this.side = side;
	}

	@Override
	void calArea()
	{
		super.area=this.side*this.side;
	}
}

class rectangle extends shape
{
	private float w,h;
	public rectangle()
	{
		this.w=5.0f;
		this.h=2.0f;
	}
	public rectangle(float w, float h) {
		this.w = w;
		this.h = h;
	}
	@Override
	void calArea()
	{
		super.area=w*h;
	}
	
	
}

public class abstractdemo 
{

	final public static void main(String[] args) 
	{
		square s=new square();
		rectangle r=new rectangle();
		s.calArea();
		s.show();
		
		r.calArea();
		r.show();
	}

}
