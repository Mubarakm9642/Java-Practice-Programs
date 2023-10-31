package anudeep_practice;
import java.util.Scanner;
public class Chef_bucket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int x=sc.nextInt();
		if(k>x) {
			int t=k-x;
			System.out.println("the capacity of bucket is "+k+" liter but it is already filled with "+x+" liter adding "+t+" more liter of water to the bucket fills it to "+k);
		}
		else {
			System.out.println("over flow");
		}

	}

}
