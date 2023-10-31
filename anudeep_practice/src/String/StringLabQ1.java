package String;
import java.util.Scanner;;

public class StringLabQ1 {

	public static void main(String[] args) {
		// creating Scanner object
		Scanner sc=new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the sectence");
		String sentence=sc.nextLine();
		
		// Declaration and initializing a variables
		int totalDigits=0;
		int totalSmallLetters=0;
		int totalCapitalLtters=0;
		int totalAlphabets=0;
		int totalSpecialCharectors=0;
		int totalVowels=0;
		int totalWords=0;
		
		// for loop for converting to user input to array
		for(char ch:sentence.toCharArray()) {
			//checking conditions
			if(Character.isDigit(ch)) {
				totalDigits++;
			}
			else if(Character.isLowerCase(ch)) {
				totalSmallLetters++;
				totalAlphabets++;
			}else if(Character.isUpperCase(ch)) {
				totalCapitalLtters++;
				totalAlphabets++;
			}else if(Character.isWhitespace(ch)) {
				totalWords++;
			}else {
				totalSpecialCharectors++;
			}
			
			//condition for vowels
			if(ch =='a' || ch =='e' || ch=='i'||ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' ) {
				totalVowels++;
			}
		}
		// displaying all variables
		System.out.println("Total number of digits present "+totalDigits);
		System.out.println("Total number of small letters "+totalSmallLetters);
		System.out.println("Total number of capital letters "+totalCapitalLtters);
		System.out.println("Total number of alphabets "+totalAlphabets);
		System.out.println("Total number of special character "+totalSpecialCharectors);
		System.out.println("Total number of vowels "+totalVowels);
		System.out.println("Total Number words present "+totalWords);

	}

}
