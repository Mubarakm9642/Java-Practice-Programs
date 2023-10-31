package String;
import java.util.StringTokenizer;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String iStr = "Anudeep Foundation";
		 
		// Creating a StringTokenizer object
	     StringTokenizer tokenizer = new StringTokenizer(iStr);
	     
	     //Creating a countTokens() method
	     System.out.println("Number of Tokens: " + tokenizer.countTokens());
	     
	   //Creating a nextToken() method
	   
	     
	   //Creating a nextElement() method
	     
	     while (tokenizer.hasMoreTokens()) {
	    	 System.out.println(tokenizer.nextElement());
	    	 }


	}

}
