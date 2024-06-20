package com.tnsif.Day3;

public class inherit extends com.tnsif.Day2.prg1 {
	/*
	 * Types of inheritances
	 * 1. single level
	 * 2. Multi-Level
	 * 3. Multiple inheritance (interfaces !class)
	 * 4. Hierarchical
	 *  
	 *  Access modifiers
	 *  1. public (Can be accessed any where in the program)
	 *  2. Protected{can be assessed by parent and child classes + classes cannot be declared as protected.,}
	 *  3. Default(with no access modifier){Packages}
	 *  4. Private{Only within the same class members can be assessed}
	 */

	public String getN()
	{
		return n+" Inside different class";
	}
	public static void main(String[] args) {

		inherit obj=new inherit();
		System.out.println(obj.getN());
	}

}
