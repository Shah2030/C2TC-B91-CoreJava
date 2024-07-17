package com.tnsif.Day15;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Collection of elements FIFO order
 * 
 * Abstract Methods:
 * add() - tail
 * remove() - head
 * peek() - return head of the Q
 * pool() - remove head of the Q
 * offer() - insert new element without violating the capacity of the Q
 * 
 * Priority Q: Collection of elements in which elements are stored in order of their priority
 * similar to ordinary Q
 * Stored in order of their priority
 * the element with highest priority will be accessed 1st 
 * DS used is BinaryHeap
 * BinerayHeap - is complete Complete Binary Tree
 * Does not allow null Elements
 * Generic Data type 
 * Grow Automatically
 * head(Front) contain least priority element
 * tail(rear) contain major priority element
 * removal of elements takes from head
 * Duplicate elements can be present
 * 
 * Double ended Q: Insertion & Deletion is possible from both the ends i.e., front(head) and rear(tail) end
 * Deque<Integer> - Double ended Queue
 * ctrl + click on the Class/MEthod etc.,
 * Not Thread safe
 * */
public class queuedemo 
{

	public static void main(String[] args) 
	{
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<5;i++)
			q.add(i);
		System.out.println("Elements of the Q are: "+q);
		
		//To remove the head  of the Q
		int r=q.remove();
		System.out.println("Removed element is: "+r);
		
		//To view head of the queue
		int h=q.peek();
		System.out.println("Peeked element is: "+h);
		
		//To view head of the queue and remove it
		int p=q.poll();
		System.out.println("Removed element is: "+p);
		
		System.out.println(q);
		
		
	}

}
