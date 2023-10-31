package anudeep_practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
