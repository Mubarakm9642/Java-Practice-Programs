package String;
import java.util.Scanner;

//creating class ShowRoom
class ShowRoom{
	//declaring variables 
	String name;
	long mobileNo;
	double cost;
	double amount;
	double dis;
	
	//default constructor
	ShowRoom(){
		name="";
		mobileNo=0;
		cost=0;
		amount=0;
		dis = 0;
	}
	//creating method called input
	void input() {
		//creating a scanner class
		Scanner sc=new Scanner(System.in);
		//displaying details
		System.out.println("enter your name\n");
		name=sc.nextLine();
		System.out.println("enter your mobile Number\n");
		mobileNo=sc.nextLong();
		System.out.println("enter your cost\n");
		cost=sc.nextDouble();
		
	}
	//creating a method called calculate
	void calculate() {
		if(cost<=10000) {
			dis=cost*0.05; // 5% discount
		}
		else if(cost<=20000) { // 10% discount
			dis=cost*0.10;
		}
		else if(cost<=350000) { // 15% discount
			dis=cost*0.15;
		}
		else {
			dis=cost*0.20; // 20% discount
		}
		amount=cost-dis;
	}
	
	// creating a method called display to display all details
	void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Amount to be paid after discount: Rs. " + amount);
    }
}
public class StringLabQ2 {

	public static void main(String[] args) {
		//creating object for ShowRoom class
		ShowRoom showroom = new ShowRoom();
		//calling methods
        showroom.input();
        showroom.calculate();
        showroom.display();

	}

}
