public class BankAccount
{
   private double balance;
   private double interestRate;

   public BankAccount(double intRate)
   {
      balance = 0.0;
      interestRate = intRate;
   } 

   public BankAccount(double startBal, double intRate)
   {
      balance = startBal;
      interestRate = intRate;
   }

   public double getBalance()
   {
      return balance;
   }

   public double getInterestRate()
   {
      return interestRate;
   }

   public void setInterestRate(double intRate)
   {
      interestRate = intRate;
   }

   public void deposit(double amount)
   {
      balance+=amount;
   }

   public void withdraw(double amount)
   {
      balance-=amount;
   }

   public void addInterest()
   {
      balance+=balance*interestRate;
   }
}
