package anudeep_practice;
import java.util.Scanner;
public class TwoDigitNumberOrNot {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.println("enter the value of n\n");
	        n= sc.nextInt();
	        if (n >= 10 && n <= 99) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }
}
