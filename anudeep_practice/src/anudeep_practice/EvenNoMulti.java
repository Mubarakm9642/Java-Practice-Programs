package anudeep_practice;
import java.util.Scanner;
public class EvenNoMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("enter the values of X and Y\n");
		x=sc.nextInt();
		y=sc.nextInt();
		if(x%2==0&&y%2==0) {
			int n=x*y;
			System.out.println(n);
		}
		else {
			System.out.println("sum="+x+y);
		}
		

	}

}
