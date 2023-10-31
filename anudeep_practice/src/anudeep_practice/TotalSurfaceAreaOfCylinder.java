package anudeep_practice;

import java.util.Scanner;

public class TotalSurfaceAreaOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float pi=3.14f;
		float r=sc.nextInt();
		float h=sc.nextInt();
		float area=2 * pi* r*(r+h);
		System.out.println(area);

	}

}
