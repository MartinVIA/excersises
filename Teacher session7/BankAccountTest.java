import java.util.Scanner;
public class BankAccountTest{
  public static void main(String[] args){

    BankAccount account = new BankAccount(200, 0.02);
    Scanner scan = new Scanner(System.in);
    int choice = 0;
    double amount = 0.0;

    System.out.println("Current balance: " + account.getBalance() + "\n\n");

    System.out.println("Press 1 to deposit.");
    System.out.println("Press 2 to withdraw.");
    System.out.println("Press 3 to change interest.\n");

    choice = scan.nextInt();

    if (choice == 1)
    {
      System.out.print("How much do you want to deposit? ");
      amount = scan.nextDouble();
      account.deposit(amount);
    }
    else if (choice == 2)
    {
      System.out.print("How much do you want to withdraw? ");
      amount = scan.nextDouble();
      account.withdraw(amount);
    }
    else if (choice == 3)
    {
      System.out.print("Enter new interest rate: ");
      amount = scan.nextDouble();
      account.setInterestRate(amount);
    }
    else
    {
      System.out.println("You entered a wrong value");
    }

    System.out.println("\nBalance: " + account.getBalance());
    System.out.println("Interest rate: " + account.getInterestRate());
  }
}
