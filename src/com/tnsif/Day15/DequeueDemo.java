package com.tnsif.Day15;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo 
{

	public static void main(String[] args) 
	{
		Deque<String> adq=new ArrayDeque<String>();
		adq.add("Samsung");
		adq.add("Motorola");
		adq.add("iphone");
		adq.add("Nokia");
		System.out.println(adq);
		
		adq.offerFirst("Lava");
		System.out.println(adq);
		adq.offerLast("Lava");
		System.out.println(adq);
		
	}

}
