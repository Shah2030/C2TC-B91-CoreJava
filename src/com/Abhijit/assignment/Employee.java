package com.Abhijit.assignment;

class Employee 
{
	private String name;
	private int empid;
	private double sal;
	
	public int getEmpid() 
	{
		return empid;
	}
	public String getName() 
	{
		return name;
	}
	public double getSal() 
	{
		return sal;
	}
	protected void setEmpid(int empid) 
	{
		this.empid = empid;
	}
	protected void setName(String name) 
	{
		this.name = name;
	}
	protected void setSal(double sal) 
	{
		this.sal = sal;
	}
}

class Manager extends Employee
{
	
}

class Developer extends Employee
{
	
}