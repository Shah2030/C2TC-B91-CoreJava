package com.tnsif.Day17;
import java.util.Scanner;

//UpperCase letters at last and rest letters in the same order Assignment

public class work
{
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String sb=new String(s.nextLine());
		String osc="";
		String oss="";
		for(int i=0;i<sb.length();i++)
		{
			String c=sb.charAt(i)+"";
			if(c==" ")
				oss+=" ";
			else if(c==c.toLowerCase())
				oss+=c; 
			else
				osc+=c;	
		}
		System.out.println(oss+osc);
		s.close();
	}

}
