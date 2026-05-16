package Others;

class InvalidMarksException extends Exception
{
	InvalidMarksException(String message)
	{
		super(message);
	}
}

public class MarksCheckers {

	public static void main(String[] args) {

		int marks = 110;

		try {
		if(marks<0 || marks>100)
		{
			throw new InvalidMarksException("InvalidMarksException: Marks must be between 0 and 100");
		}
		else
		{
			System.out.println("Valid marks");
		}
		}catch(InvalidMarksException e)
		{
			System.out.println(e.getMessage());
		}
	}
}