package com.tnsif.Day8;
/*
 * Overloading a method
 * Overriding a method {overridden method -> PArent and overriding a method -> child class}
 * super keyword is used to call imeidate parent class {Super class: member,avoid name conflict, over riding, Enhance code reusablity}
 * Up casting: {parent p= new child()}but not{child c=new parent()}
 * instanceof{Dynamic type checlking, polymorphic behavior, and safe type convenction}
 * */
public class opeartor
{

	public static void main(String[] args) 
	{
		String name="TNSIF";
		boolean result=name instanceof String; //to check wheather my instance is part of String class or not
		System.out.println("Name instance: "+result);
		opeartor op=new opeartor();
		boolean re=op instanceof opeartor;
		System.out.println("op instance: "+re);
		
	}

}
