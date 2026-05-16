package Others;

class InvalidEmailException  extends Exception
{
	InvalidEmailException (String message)
	{
		super(message);
	}
}

public class EmailValidator {

	public static void main(String[] args) {

		String email = "abcgmail.com";

		try {
			validateEmail(email);
			System.out.println("Email accepted");
		}catch(InvalidEmailException e)
		{
			System.out.println(e.getMessage());
		}
	}

	static void validateEmail(String email) throws InvalidEmailException
	{
		if(!email.contains("@") || !email.contains(".com"))
		{
			throw new InvalidEmailException("InvalidEmailException: Invalid email format");
		}
	}
}
