package com.tnsif.Annotation;

import java.util.ArrayList;
import java.util.List;

/*
 * Do not change the action of the program
 * just gives additional information is the compiler
 * 
 * Built in hierchy
 * Custom Hierchy
 * 
 * Category of Annotation
 * Marker -> Mark a declaration {Override,Overload} - contains no data at all
 * Single -> Contains only 1 member {TestAnnotation("Testing"), TestNg}
 * Full \ 
 * 		 > Consists of multiple data member {@TestAnnotation(owner='' value='')}
 * Type / 
 * Repeating -> Applied to single item more than once
 *  
 * Why Annotation:
 * The information related to that code is received by compiler
 * 
 * */
public class AnnotationDemo 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		List a=new ArrayList();
		student s=new student(214,"Ram");
		a.add(s);
		System.out.println(s);
	}
}
