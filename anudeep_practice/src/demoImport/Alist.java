package demoImport;
import java.util.*;

public class Alist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Adding elements of different types
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add("String");
		ar.add(20.1);
		ar.add(true);
		
		// Displaying the contents of the ArrayList
        System.out.println("ArrayList contents: " + ar);
        
        // Accessing elements by index
        System.out.println("Element at index 0: " + ar.get(0));
        
        // Modifying an element
        ar.set(1, 100);
        System.out.println("Modified ArrayList: " + ar);
        
        // Checking if the ArrayList contains a specific element
        boolean containsString =ar.contains("String");
        System.out.println("ArrayList contains 'String': " + containsString);
        
        // Removing an element by value
        ar.remove("String");
        System.out.println("ArrayList after removing 'String': " + ar);

        // Getting the size of the ArrayList
        System.out.println("ArrayList size: " + ar.size());

        // Clearing all elements from the ArrayList
        ar.clear();
        System.out.println("ArrayList after clearing: " + ar);
		
		

	}

}
