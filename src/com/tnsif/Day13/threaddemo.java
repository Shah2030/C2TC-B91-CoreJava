package com.tnsif.Day13;
/*
 * Thread: it is a single independent path of execution
 * there is always 1 thread running internally by the JVM while executing the program statements present in the program
 * 1 flow then single threaded program
 * every java program has at least 1 thread called main thread {parent thread}
 * the user created thread is said to be child thread
 * when main thread ends its execution part of the program will also end 
 * main thread ends at last in order to complete the execution 
 * 
 * 
 * Process: it is a program that executes a single thread {shares same memory address}
 * Every process can have more than 1 thread
 * every process has there own separate space for execution
 * 
 * 
 * Multithreading: the process executing simultaneously
 * it is technique or program in which a program is divided into two or more sub programs
 * switching b/w thread is known as context switch
 * 
 * Thread class contains 4 Constructors present in java.lang package 
 * 1. Thread() -> default constructor
 * 2. Thread(String name) -> it creates a new thread with specified name
 * 3. Thread(Runnable r) -> reference to obj runtime interface
 * 4. Thread()2,3
 *
 * Thread creation: 2 ways
 * 1. extending Thread class
 * 2. Implementing runnable interface
 * 
 * Runnable interface has only run() as abstract method
 * Runnable is the best way to create thread
 * 
 * */
public class threaddemo extends Thread {

	public void run()
	{
		System.out.println("Thread is running.,,,");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main thread is running..,");
		threaddemo d=new threaddemo();
		d.start();
	}

}
