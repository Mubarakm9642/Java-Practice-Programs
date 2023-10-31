package demoImport;

import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList arl = new ArrayList();
		
		// Input the user number of elements
		System.out.println("enter the number of elements: ");
		int x = sc.nextInt();
		
		// Input the user elements
		System.out.println(" enter the elements");
		for(int i=0;i<x;i++) {
			int ele = sc.nextInt();
			arl.add(ele);
		
		}
		
		 // Sorting the elements in ascending order
		Collections.sort(arl);
		System.out.println("sorted array list: "+arl);
		
		 // Input the element for frequency element
        System.out.print("Enter the element to find its frequency: ");
        int tElement = sc.nextInt();
        
     // Finding the frequency of the target element in the ArrayList
        int frequency = Collections.frequency(arl, tElement);
        
     // Displaying the frequency of the target element
        System.out.println("Frequency of " + tElement + ": " + frequency);

	}

}
