package Threads;	// Package declaration

class Example_A extends Thread	// Define class Example_A and extend Thread class
{
	public void run() // Override the run method of Thread
	{
		for(int i = 1;i<=5;i++)	// Loop from 1 to 5
		{
			// Print a message with the current value of i
			System.out.println("This is Thread A: "+i);	
			try
			{
				Thread.sleep(100);// Pause the thread execution for 100 milliseconds
			}
			catch(Exception e)
			{
				e.printStackTrace();	// Print any exceptions that occur
			}
			
		}
	}
}

class Example_B extends Thread // Define class Example_A and extend Thread class
{
	public void run() // Override the run method of Thread
	{
		for(int i=1;i<=5;i++) // Loop from 1 to 5
		{
			// Print a message with the current value of i
			System.out.println("This is Thread B: "+i);
			try
			{
				Thread.sleep(100);	// Pause the thread execution for 100 milliseconds
			}
			catch(Exception e)
			{
				e.printStackTrace();	// Print any exceptions that occur
			}
		}
	}
}

class Example_C extends Thread // Define class Example_A and extend Thread class
{
	public void run() // Override the run method of Thread
	{
		for(int i=1;i<=5;i++) // Loop from 1 to 5
		{
			// Print a message with the current value of i
			System.out.println("This is Thread C:"+i);
			try
			{
				Thread.sleep(100);	// Pause the thread execution for 100 milliseconds
			}
			catch(Exception e)
			{
				e.printStackTrace();	// Print any exceptions that occur
			}
		}
	}
}

public class Threads {	// use-Define the main class

	public static void main(String[] args) {	// main method
		 Example_A threadA = new Example_A(); // Create an instance of Example_A
	     Example_B threadB = new Example_B(); // Create an instance of Example_B
	     Example_C threadC = new Example_C(); // Create an instance of Example_C

	     // Start the threads
	     threadA.start(); // Start ExampleA
	     threadB.start(); // Start Example_B
	     threadC.start(); // Start Example_C

	}

}
