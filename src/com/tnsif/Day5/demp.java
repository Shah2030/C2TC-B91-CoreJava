package com.tnsif.Day5;

import java.util.Scanner;

public class demp {

	public static void main(String[] args) 
	{
		person p1= new person(); //cunstructor does not have return type + initilize objects
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the details: (Name,City,Age)");
		p1.setPname(s.nextLine());
		p1.setCity(s.nextLine());
		p1.setAge(s.nextInt());
		System.out.println("Person Details: "+p1.getPname()+"\t"+p1.getCity()+"\t"+p1.getAge());
	}

}
