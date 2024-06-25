package com.tnsif.Day8;

class vehical
{
	
}
class car extends vehical
{
	
}
public class maindemo 
{

	public static void main(String[] args) {
		car c=new car();
		System.out.println(c instanceof vehical);
		//car c1=new vehical(); this one is not possible because it is a parent constructor
		
	}

}
