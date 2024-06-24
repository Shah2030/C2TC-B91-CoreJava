package com.tnsif.Day7;
/*
 * inheritance uses (Parent,super,base) -> (child,sub,derived)
 * multiple is not aloud in java
 *
 * Types of inheritance
 * 1.single -{class citizen extends student}
 * 2.Multiple -{}
 * 3.Hybrid
 * 4.Multilevel
 * 5.Hyrerichical
 * */
class citizen
{
	//base class
	private String name;
	private String adhar;
	private String Address;
	private long pno;
	
	@Override
	public String toString() {
		return "citizen [name=" + name + ", adhar=" + adhar + ", Address=" + Address + ", pno=" + pno + "]";
	}

	public citizen()
	{
		//default constructor
		System.out.println("Citizen object createtd");
	}
	
	public citizen(String name, String adhar, String address, long pno) 
	{
		//parameterized constructor
		super();
		this.name = name;
		this.adhar = adhar;
		Address = address;
		this.pno = pno;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPno() {
		return pno;
	}
	public void setPno(long pno) {
		this.pno = pno;
	}
}

class student extends citizen
{
	//derived class
	
	private int rollno;
	private String Collname;
	
	public student() {
		super();
	}
	public student(String name, String adhar, String address, long pno, int rollno,String collname) {
		super(name, adhar, address, pno); //Accessing parent class constructor
		this.rollno=rollno;
		this.Collname=collname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollname() {
		return Collname;
	}
	public void setCollname(String collname) {
		Collname = collname;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", Collname=" + Collname + ", toString()=" + super.toString()+ "]";
	}
		
}

public class inheritance_example_Single_leve {

	public static void main(String a[])
	{
		student s=new student("Abc","123456","bglor",789546020,802,"MS Ramahia");
		System.out.println(s); //this was single level inheritance 
	}
}
