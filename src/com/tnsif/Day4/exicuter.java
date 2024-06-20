package com.tnsif.Day4;

public class exicuter {

	public static void main(String[] args) 
	{
		Base b1= new Base();
		b1.meDefault();
		b1.meProtected();
		b1.mePublic();
		/* private methods or members cannot be accessed
		b1.mePrivate(); */
	}

}
