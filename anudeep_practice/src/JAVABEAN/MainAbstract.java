package JAVABEAN;
//Abstract class BankAccount
abstract class BankAccount {
 private String accountNumber;
 protected double balance;
 
//constructor
 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Abstract methods
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);

 //printing account details
 public void printBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
 }
}

//Subclass CheckingAccount inheriting from BankAccount
class CheckingAccount extends BankAccount {
	//constructor
 public CheckingAccount(String accountNumber, double initialBalance) {
     super(accountNumber, initialBalance);
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
         System.out.println("Insufficient balance!");	// printing Insufficient balance
     }
 }
}

//main class
public class MainAbstract {
 public static void main(String[] args) {
     CheckingAccount myAccount = new CheckingAccount("12345", 1000.0);  //object creation with passing parameters
     
   //method calling with parameter
     myAccount.deposit(500.0);
     myAccount.withdraw(200.0);
     myAccount.withdraw(1500.0);
     
   //method calling 
     myAccount.printBalance();
 }
}
