package com.tnsif.Day11;

import java.util.Arrays;

//Write  a program to find the  second largest  number in the array
public class task2 {

	public static int soln(int a[])
	{
		int temp1=0,temp2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(temp1<a[j])
				{
					temp1=a[j];
				}
				else if(temp2<a[j] && temp1!=a[j])
				{
					temp2=a[j];
				}
			}
		}
		return temp2;
	}
	public static void main(String[] args) 
	{
		
		int a[]= {10,20,300,50,100,5000,600,10,5,800,200,5000};
		System.out.println("Second Largest number is: "+soln(a));
	}

}
