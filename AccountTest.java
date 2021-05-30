// Create and manipulate an Account object.
import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args) 
   {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", 80); 

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance()); 

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter withdrawal amount for account1: "); // prompt
      double withdrawalAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nsubtracting %.2f from account1 balance%n", withdrawalAmount);
      account1.withdraw(withdrawalAmount); // subtract amount from account1

      // display balances
      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance()); 

      System.out.print("Enter withdrawal amount for account2: "); // prompt
      withdrawalAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nsubtracting %.2f from account2 balance%n", withdrawalAmount);
      account2.withdraw(withdrawalAmount); // subtract amount from account2

      // display balances
      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance()); 
   } // end main
} // end class AccountTest

