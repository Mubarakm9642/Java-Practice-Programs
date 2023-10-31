package anudeep_practice;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int large=n;
		if(m>large) {
			large=m;
		}
		System.out.println("the largest number among 2 integer number is="+large);

	}

}
