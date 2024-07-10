package com.tnsif.Day13;
/*
 * Synchronization:
 * Capacity to control the access of multiple threads to any shared resources
 * To produce inconsistent result
 * reliable communication b/w the threads is established
 * 
 * Types:
 * Process Sys: runs independently 
 * Thread Sys: {Mutual Exclusive[only 1 thread](method, block, static Sys), }
 * 								Synchronized - locked   Synchronized(obj) 
 * 														to prevent concurrency problem
 * 														to prevent thread thread interference 
 * inter thread communication is done using join(), notify(), wait() 
 * */
public class syndemo 
{
	private int c=0;
	public synchronized void inc()
	{
		c++;
	}
	public synchronized int getc()
	{
		return c;
	}

	public static void main(String[] args) 
	{
		syndemo s=new syndemo();
		final int nt=10;
		final int inc=1000;
		Thread[] threads=new Thread[nt];
		for(int i=0; i<nt; i++)
		{
			threads[i]=new Thread(() ->{
				for(int j=0;j<inc;j++)
				{
					s.inc();
				}
			});
			threads[i].start();
		}
		//Waiting all thread to finish current count
		for(int i=0;i<nt;i++)
		{
			try
			{
				threads[i].join();
			}
			catch(InterruptedException e)
			{
				System.err.println(e);
			}
		}
		System.out.println("Final Count: "+s.getc());

		
	}

}
