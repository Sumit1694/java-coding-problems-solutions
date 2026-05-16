package Others;

class InvalidSalaryException extends RuntimeException
{
	InvalidSalaryException(String message)
	{
		super(message);
	}
}

public class SalaryChecker {

	public static void main(String[] args) {

		int salary = -5000;

		try {
			if(salary<0)
			{
				throw new InvalidSalaryException("InvalidSalaryException: Salary cannot be negative");
			}
			else
			{
				System.out.println("Salary Accepted!");
			}
		}
		catch(InvalidSalaryException e)
		{
			System.out.println(e.getMessage());
		}
	}
}