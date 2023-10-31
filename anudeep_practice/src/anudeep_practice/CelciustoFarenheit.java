package anudeep_practice;

import java.util.Scanner;

public class CelciustoFarenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float celsius=sc.nextInt();
		float fahrenheit= ((celsius*9)/5)+32;
		System.out.println(fahrenheit);


	}

}
