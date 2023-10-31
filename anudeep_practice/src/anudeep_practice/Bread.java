package anudeep_practice;
import java.util.Scanner;
public class Bread {

	public static void main(String[] args) {
		/* N=number of loaves of bread
		 * M=expiration Days
		 * k=Loaves Per Day
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of loaves of bread(N): ");
		int N=sc.nextInt();//taking input from the user for the total number of loaves
		
		System.out.println("Enter the number of days until bread expiration(M): ");
		int M=sc.nextInt();//taking input from the user for the expiration Days of loaves
		
		System.out.println("Enter the maximum number of loaves eikcook can eat in a day (K): ");
		int K=sc.nextInt();//taking input from the user for the max Loaves Per Day
		
		//checking the condition 
		if (N <= M) {
            System.out.println("'YES' Eikocck can eat all the loaves of bread before they expire.");
        } else {
            System.out.println("'NO' Eikocck cannot eat all the loaves of bread before they expire.");
        }

	}

}
