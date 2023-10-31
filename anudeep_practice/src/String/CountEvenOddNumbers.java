package String;

import java.util.Scanner;

public class CountEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		// Asking the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        
     // Creating the array of the specified size
        int[] array=new int[size];
        
     // Asking the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++) {
        	System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        
        int evenCount = 0;
        int oddCount = 0;
        //loop to calculate the count of even and odd numbers
        for (int n : array) {
            if (n % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Displaying the counts
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);

	}
	
	

}
