package com.tnsif.Day14;

public class stud {

	private int rno;
	private String name;
	private float per;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public stud(int rno, String name, float per) {
		super();
		this.rno = rno;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "stud [rno=" + rno + ", name=" + name + ", per=" + per + "]";
	}
	
}
