package com.tnsif.Day10;
//program to demonstrate late binding
class rbi
{
	public float getrateofinterest()
	{
		return 6.7f;
	}
}

class sbi extends rbi
{
	@Override
	public float getrateofinterest()
	{
		return 7.0f;
	}
}

class hdfc extends rbi
{
	@Override
	public float getrateofinterest()
	{
		return 6.5f;
	}
}

class icici extends rbi
{
	@Override
	public float getrateofinterest()
	{
		return 6.7f;
	}
}

public class runtimeddemo 
{

	public static void main(String[] args) 
	{
		rbi r;
		//Dynamic binding assigning the child to parent class reference var
		r=new sbi();
		System.out.println("Interest rate of SBI: "+r.getrateofinterest());
		
		r=new hdfc();
		System.out.println("Interest rate of HDFC: "+r.getrateofinterest());
		
		r=new icici();
		System.out.println("Interest rate of ICICI: "+r.getrateofinterest());
		
		//Work: Task :  Difference  between  Method Overloading and Method  Overriding
			
	}

}
