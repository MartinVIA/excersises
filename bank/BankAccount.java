public class BankAccount{
    private double balance;
    private double interestRate;
    public BankAccount(double intRate){
        balance = 0.0;
        interestRate = intRate;
    }
    public BankAccount(double startBal, double intRate){
        balance = startBal;
            interestRate = intRate;
        }
    }
