package com.tnsif.Day16;

public class driver implements functionaldemo
{
	public String show()
	{
		return "Hello TNSIF";
	}

	public static void main(String[] args) 
	{
		driver d=new driver();
		System.out.println(d.show());
		
		//Anonymous Class traditional Way
		functionaldemo f=new functionaldemo()
		{
			public String show()
			{
				return "Welcome";
			}
		};
		
		System.out.println(f.show());
	}

}
