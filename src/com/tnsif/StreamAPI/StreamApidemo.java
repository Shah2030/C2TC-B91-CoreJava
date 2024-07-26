package com.tnsif.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * StreamAPI: 
 * Makes Filtering easy
 * 
 * Operations:
 * Intermediate OPeration: Change 1 process to another process then this is used{filter.map.limit}
 * Terminal Operation: gets final result{Collect}
 * 
 * Methods:
 * Filter: only 1 object {.stream(),.filter(isToy),.collect()}
 * Map: 1 to 1 mapping, Transform into another form then map
 * FlatMap: Multiple Results i.e., 1 to many
 * 
 * */
public class StreamApidemo 
{
	

	public static void main(String[] args) 
	{
		filterExample();
		mapExample();
		//flatMap();

	}
	public static void filterExample()
	{
		//creating list of integers
		List<Integer> l=Arrays.asList(3,4,6,12,20,25);
		//elements / by 5
		
		l.stream()
		 .filter(num->num%5==0)
		 .forEach(System.out::println);
	}
	public static void mapExample()
	{
		//creating list of integers
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		List<Integer> r=l
				.stream()
				.map(x->x*2)
				.collect(Collectors.toList());
		System.out.println(r);
	}
/*	public static void flatMap()
	{
		//creating list of integers
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		List<Integer> r = l.stream()
                .flatMap(x -> Stream.of(x, x * x))
                .collect(Collectors.toList());

        System.out.println(r);
	} */	
}
