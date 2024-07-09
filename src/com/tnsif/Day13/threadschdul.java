package com.tnsif.Day13;
/*
 * * Scheduling thread priority
 * Thread run in priority levels 
 * minimum =1
 * normal =5
 * maximum =10
 * 
 * getPriority(): gets priority
 * setPriority(): sets priority
 * 
 * Uses:
 * Multitasking
 * UserInterFaceResponce
 * Asynchronous programming
 * Background Processing
 * 
 * Real time example:{Word processing program, Browser rendering a web page, switching b/w application, Running animation}
 * */
public class threadschdul 
{

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread()); //details of current thread
		//Output: Thread[Thread name{main}, priority{5}, Thread Pool name{main}(it cannot be changed)]
		Thread.currentThread().setName("Parent");
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread());
		
	}

}
