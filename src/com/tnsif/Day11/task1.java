package com.tnsif.Day11;
//Write  a  program to  print the odd and even elements in the  array
public class task1 {

	public static void main(String[] args) 
	{
		int a[]= {10,5,15,20,25,30,3};
		for(int i=0;i<a.length;i++)
			if(i%2==0)
				System.out.println("Even number: "+a[i]);
			else
				System.out.println("Odd number: "+a[i]);

	}

}
