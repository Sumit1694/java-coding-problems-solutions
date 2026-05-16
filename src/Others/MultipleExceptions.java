package Others;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}

class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String message)
	{
		super(message);
	}
}

class InvalidPINException extends Exception
{
	InvalidPINException(String message)
	{
		super(message);
	}
}

public class MultipleExceptions {

	public static void main(String[] args) throws InvalidAgeException, Others.InvalidPINException, Others.InsufficientBalanceException {

		int age = 16;
		int balance = 5100;
		int pin = 1234;

		AgeValidator(age);
		InsufficientBalanceException(balance);
		InvalidPINException(pin);
		System.out.println("Login successful!");
	}

	static void AgeValidator(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("InvalidAgeException: Age below 18.");
		}
	}

	static void InsufficientBalanceException(int bal) throws InsufficientBalanceException
	{
		if(bal<5000)
		{
			throw new InsufficientBalanceException("InsufficientBalanceException: balance below 5000.");
		}
	}

	static void InvalidPINException(int PIN) throws InvalidPINException
	{
		if(!(PIN>999) || !(PIN<=9999))
		{
            throw new InvalidPINException("InvalidPINException: PIN is invalid");
		}
	}
}
