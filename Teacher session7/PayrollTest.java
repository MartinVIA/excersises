import java.util.Scanner;

public class PayrollTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = scan.nextLine();

		System.out.print("How many hours did you work? ");
		double hours = scan.nextDouble();

		System.out.print("What is your hourly pay rate? ");
		double payRate = scan.nextDouble();

		Payroll payroll1 = new Payroll(name, hours, payRate);

		System.out.println(payroll1.getName() + ", your gross pay is $"	+ payroll1.getGrossPay());
	}
}
