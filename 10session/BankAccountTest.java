import java.util.Scanner;

public class BankAccountTest
{
   public static void main(String[] args)
   {
      BankAccount account = new BankAccount(0.02);

      Scanner scan = new Scanner(System.in);

      int choice = 0;
      double amount = 0.0;

      System.out.println();

      do
      {
         System.out.println("Press 1 to display account balance.");
         System.out.println("Press 2 to display interest rate.");
         System.out.println("Press 3 to change interest rate.");
         System.out.println("Press 4 to add interest.");
         System.out.println("Press 5 to withdraw.");
         System.out.println("Press 6 to deposit.");
         System.out.println("Press 9 to quit.");
	 
         choice = scan.nextInt();
	 
         if(choice == 1)
         {
            System.out.print("The account balance is: " + account.getBalance());
         }
         else if(choice == 2)
         {
            System.out.print("The interest rate is: " + account.getInterestRate());
         }
         else if(choice == 3)
         {
            System.out.print("Enter new interest rate: ");
            amount = scan.nextDouble();
            account.setInterestRate(amount);
            System.out.println("Interest rate is now: "+account.getInterestRate());
         }
         else if(choice == 4)
         {
            account.addInterest();
            System.out.println("Interest was added.");
         }
         else if(choice == 5)
         {
            System.out.print("How much do you want to withdraw? ");
            amount = scan.nextDouble();
            account.withdraw(amount);	 
            System.out.println(amount + " was withdrawn.");
         }
         else if(choice == 6)
         {
            System.out.print("How much do you want to deposit? ");
            amount = scan.nextDouble();
            account.deposit(amount);
            System.out.println(amount + " was deposited.");
         }
         else if(choice == 9)
         {
            System.out.println("Bye bye.");
         }
         else
         {
            System.out.println("Error");
         }
	 
         System.out.println("\n\n");
      }
      while(choice!=9);
   }
}
