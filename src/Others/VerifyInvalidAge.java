package Others;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}

public class VerifyInvalidAge {

	public static void main(String[] args) {

		int age = 16;

		try {
			if(age<18)
			{
				throw new InvalidAgeException("You are too young...Not eligible for vote!");
			}
			else
			{
				System.out.println("You can vote!");
			}
		}catch(InvalidAgeException e)
		{
            System.out.println(e.getMessage());
		}
	}
}