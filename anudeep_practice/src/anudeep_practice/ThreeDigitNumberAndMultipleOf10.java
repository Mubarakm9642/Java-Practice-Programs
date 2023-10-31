package anudeep_practice;
import java.util.Scanner;
public class ThreeDigitNumberAndMultipleOf10 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.println("enter the value of n");
	        n= sc.nextInt();
	        if (n >= 100 && n <= 999 && n % 10 == 0) 
	        {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }
}

