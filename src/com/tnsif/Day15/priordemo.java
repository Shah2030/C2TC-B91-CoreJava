package com.tnsif.Day15;

import java.util.PriorityQueue;
import java.util.Queue;

public class priordemo 
{

	public static void main(String[] args) 
	{
		Queue<String> q=new PriorityQueue<String>();
		q.add("Rect");
		q.add("Core Java");
		q.add("Angular");
		q.add("Data Structures");
		q.add("HTML");
		q.add("Basic Programming");
		q.add("Python");
		System.out.println(q);
		System.out.println("Pool Method"+q.poll());
		System.out.println(q);

	}

}
