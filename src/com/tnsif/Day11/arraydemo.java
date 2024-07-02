package com.tnsif.Day11;
/*
 * in Array '[]' is Subscript
 * [5] 5values are stored
 * Homogeneous Collection of elements
 * index starts from 0 ends with n-1 elements
 * similar data types
 * contiguous memory location
 * 
 * advantages
 * code is optimized
 * random access
 * 
 * disadvantages
 * limited size
 * 
 * types:
 * single Dimension:[] 
 * Multi dimension:[][]
 * 
 * can de declared as:
 * int[] a;-
 * int a[];- all 3 are valid
 * int []a;-
 * int a=new int[size];
 * 
 * Explore Arrays library methods
 * */

import java.util.Arrays;
//import java.util.Scanner;

//Program to demonstrate array concept
public class arraydemo {

	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);
		//System.out.print("Enter value of n: ");
		int a[]= {10,20,30,40,50};
		int key=30;
		int c[]= {10,15,22};
		for(int i=0;i<5;i++)
			System.out.print(a[i]+"\t");
		System.out.println("");
		System.out.println(Arrays.binarySearch(a,key));
		System.out.println(Arrays.equals(a, c));
	}
}
