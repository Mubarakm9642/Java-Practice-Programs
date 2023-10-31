package String;
import java.util.Arrays;
import java.util.Scanner;
public class DArray {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Asking the user for the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	        // Creating the array of the specified size
	        int[] array = new int[size];

	        // Asking the user to enter the elements of the array
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = sc.nextInt();
	        }

	        // Calling the method to find duplicates
	        findDuplicates(array);
	    }
	    
	    // sorting elements
	    public static void findDuplicates(int[] arr) {
	    	Arrays.sort(arr);

	        // Loop through the array elements
	        boolean duplicateFound = false;
	        for (int i = 1; i < arr.length; i++) {
	            // If the current element is equal to the previous element, it's a duplicate
	            if (arr[i] == arr[i - 1]) {
	                duplicateFound = true;
	                System.out.println("Duplicate found: " + arr[i]);
	            }
	        }

	        if (!duplicateFound) {
	            System.out.println("No duplicates found in the array.");
	        }
	    }
	}
