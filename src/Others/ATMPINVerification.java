package Others;

class InvalidATMpinException extends RuntimeException
{
	InvalidATMpinException(String message)
	{
		super(message);
	}
}

public class ATMPINVerification {

	public static void main(String[] args) {

       	int pin = 123;

       	try
       	{
       		validatePin(pin);
       		System.out.println("PIN Verified");
       	}
       	catch(InvalidATMpinException e)
       	{
       		System.out.println(e.getMessage());
       	}
	}

	static void validatePin(int pin)
	{
		if(pin<1000 || pin>9999)
		{
			throw new InvalidATMpinException("InvalidATMpinException: PIN should be 4 digits");
		}
	}
}