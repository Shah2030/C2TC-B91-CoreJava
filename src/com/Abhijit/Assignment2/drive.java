package com.Abhijit.Assignment2;
import java.util.Scanner;
public class drive {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("1. AirIndia\n2.KingFisher\n3.Indigo\n");
		System.out.print("Select Airlines from the above list: ");
		int ch=s.nextInt();
		System.out.print("Enter hours of travel: ");
		double h=s.nextDouble();
		System.out.print("Enter Cost per Hour: ");
		double cph=s.nextDouble();
		switch (ch) {
			case 1:{
				AirIndia a=new AirIndia(h,cph);
				System.out.printf("The Calculated price is: %.2f\n",a.calculateAmount()); 
				break;
			} 
			case 2:{
				KingFisher a=new KingFisher(h,cph);
				System.out.printf("The Calculated price is: %.2f\n",a.calculateAmount()); 
				break;
			}
			case 3:{
				Indigo a=new Indigo(h,cph);
				System.out.printf("The Calculated price is: %.2f\n",a.calculateAmount()); 
				break;
			} 
			default: System.out.println("Invallid Choice Entered..!");
		}
		s.close();
	}

}
