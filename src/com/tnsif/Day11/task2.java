package com.tnsif.Day11;
//Write  a program to find the  second largest  number in the array
public class task2 {

	public static void main(String[] args) 
	{
		int res=0;
		int a[]= {10,20,30,50,100,50,60,10,5};
		for(int i=0;i<a.length;i++)
		{
			int temp1=a[0];
			int temp2=0;
			if(a[i]>temp1)
				if(temp2<temp1)
					res=a[i];
				
		}
		System.out.println(res);
	}

}
