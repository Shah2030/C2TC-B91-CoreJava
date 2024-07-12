package com.tnsif.Day14;
import java.util.*;
public class arraylist {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		List l1=new ArrayList(); //Empty raw array
		System.out.println("List size initial: "+l1.size());
		
		l1.add(10);
		l1.add(20);
		l1.add(true);
		l1.add("OBJ");
		l1.add(10);
		System.out.println(l1);
		System.out.println("IS list empty: "+l1.isEmpty());
		System.out.println("Does list contain 10in list: "+l1.contains(10));
		l1.remove(1);
	    System.out.println("After removing 20 from list: "+l1);
	    System.out.println();
	    //Generic - can create homogeneous list 
	    List<String> names=new ArrayList<String>();
	    names.add("Abc");
	    names.add("xyz");
	    System.out.println("names stored are: "+names);
	    names.clear();
	    System.out.println("After clear the list is: "+names);
	}

}
