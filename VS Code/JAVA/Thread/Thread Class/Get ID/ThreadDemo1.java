import java.util.*;
public class ThreadDemo1 extends Thread 
{
	public void run()
	{
		System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
	
		System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
	}
	public static void main(String[] args)
		throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		
		t1.start();
		t2.start();
		
		t1.join();
	}
}
