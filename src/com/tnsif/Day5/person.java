package com.tnsif.Day5;

public class person {

	public person() {
	 System.out.println("Default Cunstructor is called");
	}
	private String Pname;
	private int age;
	private String city;
	public void setPname(String pname) 
	{
		Pname = pname;
	}
	public String getPname() {
		return Pname;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	
}
