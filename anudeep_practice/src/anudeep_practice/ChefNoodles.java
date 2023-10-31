package anudeep_practice;
import java.util.Scanner;
public class ChefNoodles {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stoves (X): ");
        int numStoves = scanner.nextInt();// taking user input for number of stoves

        System.out.print("Enter the number of minutes (Y): ");
        int numMinutes = scanner.nextInt();// taking user input for number of minutes

        //checking condition
        int TotalCustomers = numStoves * numMinutes;
        System.out.println("The maximum number of customers that can be served in " + numMinutes + " minutes: " + TotalCustomers);
    }

}

