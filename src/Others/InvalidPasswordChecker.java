package Others;

class InvalidPasswordException extends Exception
{
	InvalidPasswordException(String message)
	{
		super(message);
	}
}

public class InvalidPasswordChecker {

	public static void main(String[] args) {

		String password = "hello12";

		try {
			validatePassword(password);
			System.out.println("Valid password");
		}catch(InvalidPasswordException e)
		{
			System.out.println(e.getMessage());
		}
	}

	static void validatePassword(String password) throws InvalidPasswordException
	{
		boolean hasUpper = false;
		boolean hasDigit = false;

		for(int i=0;i<password.length();i++)
		{
			char ch = password.charAt(i);

			if(Character.isUpperCase(ch))
			{
				hasUpper = true;
			}

			if(Character.isDigit(ch))
			{
				hasDigit = true;
			}
		}

		if(password.length()<8)
		{
			throw new InvalidPasswordException("Password must contain minimum 8 characters");
		}

		if(!hasUpper)
		{
			throw new InvalidPasswordException("Password must contains on Uppercase letter!");
		}

		if(!hasDigit)
		{
			throw new InvalidPasswordException("Password must contain one digit");
		}
	}

}
