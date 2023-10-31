package demoImport;
import java.util.*;

public class LastLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a linked list
        LinkedList linkedList = new LinkedList();
        
        // Adding elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        
        // Displaying the linkedList
        System.out.println(linkedList);
        
        // Retrieve the last element without removing it using peekLast()
        int lastElement = (int) linkedList.peekLast();
        System.out.println("Last Element: " + lastElement);
       
    } 

}
