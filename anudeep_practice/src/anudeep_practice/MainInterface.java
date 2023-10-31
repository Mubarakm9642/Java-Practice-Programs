package anudeep_practice;

// BankAccount interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

// CheckingAccount class implementing the BankAccount interface
class CheckingAccount implements BankAccount {
    private double balance;
    //constructor
    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);	//Deposited PRINTING
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {	// checkking condition
            balance -= amount;
            System.out.println("Withdrawn: " + amount);	//Withdrawn printing
        } else {
        	
            System.out.println( "Insufficient balance!");	// printing Insufficient balance
        }
    }
}

// main class
public class MainInterface {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount(1000.0); //object creation with passing parameters
        
        //method calling with parameter
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(1500.0);
    }
}
