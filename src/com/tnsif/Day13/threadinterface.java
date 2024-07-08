package com.tnsif.Day13;
//program to demonstrate thread by runnable interface
public class threadinterface implements Runnable
{
	public void run()
	{
		System.out.println("Inside the child thread.,");
	}
	
	public static void main(String a[])
	{
		System.out.println("Inside the main thread");
		threadinterface t=new threadinterface();
		Thread t1=new Thread(t);// using runnable obj constructor Thread(Runnable r)
		t1.start();
	}
}
