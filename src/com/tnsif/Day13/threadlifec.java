package com.tnsif.Day13;

/*
 * Thread Life Cycle:
 * New (new born state): when created, start() is not called {call to start()}
 * Runnable state: ready for execution, start() is called { when yield() is called}
 * Running state: CPU allocates time slot to thread for its execution {when run() is called} 
 * Blocked: Idle thread(not running{when suspended(), sleep(), wait() are called})
 * Dead : {when stop() is called}, end of execution, thread is killed
 * 
 * methods used in threading are:
 * start(): Initiates the execution of thread
 * stop(): 
 * run():
 * yield():
 * suspended():
 * join(): waits for thread to die
 * wait(): current thread to wait until notify() is called
 * sleep(): causes the thread to sleep
 * notify(): wake up a signal thread
 * notifyAll(): Wakes up all threads
 * isAlive(): checks weather thread is alive or not
 * 
 * InterruptedException is used to handle the interruption exception
 * IllegalStateException when error occurs in thread
 *  
 * */
public class threadlifec extends Thread 
{
	public void run()
	{
		System.out.println("Thread alive or not: "+this.isAlive());
		int i=0;
		while(i<4)
		{
			i++;
			System.out.println("Num: "+i);
			try {
				sleep(500); //in milliseconds
				System.out.println("Status of thread is: "+ this.isAlive());
			}
			catch(InterruptedException e)
			{
				System.out.println("Interupted Exception");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Thread m=new threadlifec();
		System.out.println("Before Runnable state "+m.isAlive());
		m.start();
		try 
		{
		Thread.sleep(4000);	
		}
		catch(InterruptedException e)
		{
			System.err.println("Thread is intrupted");
		}
		System.out.println("After complete exicution of thread "+m.isAlive());
	}

}
