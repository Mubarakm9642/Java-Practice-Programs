package String;

public class Builder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a StringBuffer object with an initial capacity of 20 characters
				StringBuffer stringBuilder = new StringBuffer(20);
				// Append text to the StringBuffer
				stringBuilder.append(" Strings Buffers type 3");
				 // Print the final result
				System.out.println(stringBuilder);
				
				// Get the current capacity of the StringBuffer
		        int currentCapacity = stringBuilder.capacity();
		        System.out.println("Current capacity: " + currentCapacity);
				

	}

}
