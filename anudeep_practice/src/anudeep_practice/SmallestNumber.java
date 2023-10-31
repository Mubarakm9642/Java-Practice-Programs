package anudeep_practice;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int smallest=n;
		if(m<smallest) {
			smallest=m;
		}
		System.out.println("the smallest number among 2 integer number is="+smallest);

	}

}
