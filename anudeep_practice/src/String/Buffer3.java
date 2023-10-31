package String;

public class Buffer3 {

	public static void main(String[] args) {
		// Create a StringBuffer object with an initial capacity of 20 characters
		StringBuffer sBuffer = new StringBuffer(20);
		// Append text to the StringBuffer
		sBuffer.append(" Strings Buffers type 3");
		 // Print the final result
		System.out.println(sBuffer);
		
		// Get the current capacity of the StringBuffer
        int currentCapacity = sBuffer.capacity();
        System.out.println("Current capacity: " + currentCapacity);
		

	}

}
