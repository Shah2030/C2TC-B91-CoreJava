package com.Abhijit.Assignment2;

public class AirIndia implements Airfare {

	private double h;
	private double costperh;
	
	@Override
	public double calculateAmount() 
	{
		return h*costperh;
	}

	public AirIndia(double h, double costperh) {
		super();
		this.h = h;
		this.costperh = costperh;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getCostperh() {
		return costperh;
	}

	public void setCostperh(double costperh) {
		this.costperh = costperh;
	}

	@Override
	public String toString() {
		return "AirIndia [h=" + h + ", costperh=" + costperh + "]";
	}

	
}
