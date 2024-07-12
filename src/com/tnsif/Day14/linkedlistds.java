package com.tnsif.Day14;
/*
 * Uses Double ended queue DS
 * Support duplicate elements
 * Collection.SynchronizedList()
 * To iterate link list elements are implemented
 * 
 * */
import java.util.*;
public class linkedlistds 
{
//Program to demonstrate the linked list collection
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(40);
		l1.addFirst(5);
		l1.add(2, 30);
		l1.addLast(25);
		System.out.println(l1);
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		l1.removeFirst();
		l1.removeLast();
		System.out.println("Current list after remove method: "+l1);
		
		ListIterator<Integer> li=l1.listIterator();
		while(li.hasPrevious())
			System.out.println(li.previous());
		
		li=l1.listIterator(l1.size());
		
		while(li.hasNext())
			System.out.println(li.next());
		
		Collections.sort(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println("Decending Order"+l1);
	}

}
