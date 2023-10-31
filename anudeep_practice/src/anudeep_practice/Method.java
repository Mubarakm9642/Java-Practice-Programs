package anudeep_practice;

import java.util.Scanner;

class ArithmaticOperation{
	int addition(int x, int y) 
	{
		return x+y;
	}
	int subtraction(int x, int y) 
	{
		return x-y;
	}
	int multi(int x, int y) 
	{
		return x*y;
	}
	int div(int x, int y) 
	{
		return x/y;
	}
}
public class Method {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArithmaticOperation result= new ArithmaticOperation();
		int x,y;
		System.out.println("enter the value of X");
		x = sc.nextInt();
		System.out.println("enter the value of y");
		y =  sc.nextInt();
		System.out.println(result.addition(x, y));
		System.out.println(result.subtraction(x, y));
		System.out.println(result.multi(x, y));
		System.out.println(result.div(x, y));
		

	}

}
