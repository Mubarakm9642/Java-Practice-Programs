package anudeep_practice;
import java.util.Scanner;

public class DollerIdea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=(a * 10) / 100;
		int d=(b * 20) / 100;
		if(c>d) {
			System.out.println("first");
		}
		else if(c<d) {
			System.out.println("second");
		}
		else if(c==d){
			System.out.println("any");
		}


	}

}
