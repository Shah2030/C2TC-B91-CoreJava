package com.tnsif.Day9;
//but defining methods in main method is not possible.,
interface Regestrable
{
	//Marker or empty interface
}

class student implements Regestrable
{
	private int id;
	private String name;
	private double fees;
	private String Cource;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getCource() {
		return Cource;
	}
	public void setCource(String cource) {
		Cource = cource;
	}
	public student()
	{
		super();
	}
	public student(int id, String name, double fees, String cource) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		Cource = cource;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", fees=" + fees + ", Cource=" + Cource + "]";
	}
		
	
}


/*class greetclass implements greetinterface 
{
	@Override
	public String greet()
	{
		return "Hello Shah";
	}
}*/



public class finterfacedemo 
{

	public static void main(String[] args) 
	{

		//greetclass g=new greetclass();
		//System.out.println(g.greet());
		
		student s=new student(105,"Abc",120000,"C++");
		System.out.println(s);
		System.out.println(s instanceof Regestrable); //part of Regestrable interface
	}

}
