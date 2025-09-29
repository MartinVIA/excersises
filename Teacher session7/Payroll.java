public class Payroll
{
	private String name;
	private double hoursWorked;
	private double payRate;

	public Payroll()
	{ 
		hoursWorked = 0.0;
		payRate = 0.0;
		name = "not set";
	}

	public Payroll(String name, double hoursWorked, double payRate)
	{
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.payRate = payRate;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}

	public void setPayRate(double payRate)
	{
		this.payRate = payRate;
	}

	public String getName()
	{
		return name;
	}

	public double getHoursWorked()
	{
		return hoursWorked;
	}

	public double getPayRate()
	{
		return payRate;
	}

	public String toString()
	{
		return "Name: " + name + ", hours: " + hoursWorked + ", rate: "
				+ payRate;
	}

	// If the employee has worked more than 37 hours, the employee
	// will get 1.5 times the normal salary for all extra hours
	public double getGrossPay()
	{
		double grossPay;
		double overtimePay;

		if (hoursWorked > 37)
		{
			// first calculate normal pay for the first 37 hours
			grossPay = 37 * payRate;

			// then calculate overtime pay for all hours beyond 37
			overtimePay = (hoursWorked - 37) * (payRate * 1.5);

			grossPay += overtimePay;

		}
		else
		{
			// just normal grossPay calculation
			grossPay = hoursWorked * payRate;

		}

		// in either case we want to return the grossPay, so we return
		// it outside the if-else statement.
		return grossPay;
	}
}
