package com.tnsif.Day9;
/*
 * high security
 * cunstructor cannot be final
 * a block cannot be final
 * cannot change the value of final variable after initilization
 * cannot override class cannot be extended
 * local var of final must be initilized while declaring
 * value of parameters of a method declared final cannot be changed
 * ex: string, wrapper, system, scanner,number etc., are final class present in the java library cannot be inherited
 * 
 * */
final class finalmct {
	void show()
	{
		System.out.println("Final class cannot be inherited");
	}
	//it cannot be inherited but objct creation is possible
}

public class finaldemo {
	final int x=10; //cannot be modified

	finaldemo()
	{
		System.out.println("Default cunstructor");
	}
	public static void main(String[] args) {
		
		// final int x; cannot be used as it must be initialised
		final int x=100;
		finalmct f=new finalmct();
		f.show();
		System.out.println(x);
	}

}
