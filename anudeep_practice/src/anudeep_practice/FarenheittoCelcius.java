package anudeep_practice;

import java.util.Scanner;

public class FarenheittoCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float fahrenheit=sc.nextInt();
		float Celsius = ((fahrenheit-32)*5)/9;
		System.out.println(Celsius);


	}

}
