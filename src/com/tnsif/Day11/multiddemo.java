package com.tnsif.Day11;

public class multiddemo {

	static void parr(int c[][])
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
				System.out.print("\t"+c[i][j]);
			System.out.println("\n");
		}
		
	}
	
	public static void main(String[] args) 
	{
		int[][] a= {{12,45},{21,04},{02,05}};
		parr(a);
		System.out.println();

	}

}
