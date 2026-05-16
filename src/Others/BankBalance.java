package Others;

class BankBalanceException extends RuntimeException
{
	BankBalanceException(String message)
	{
		super(message);
	}
}

public class BankBalance {

	public static void main(String[] args) {

		int balance = 5000;
		int withdraw = 8000;

		try {
			if(!withdraw(withdraw, balance))
			{
			   throw new BankBalanceException("InsufficientBalanceException: Balance low");
			}
			else
			{
				System.out.println("Remaining balance: " + (balance-withdraw));
			}
		}catch(BankBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}

	static boolean withdraw(int amt, int bal)
	{
		if(amt<=bal)
		{
			bal = bal - amt;
			return true;
		}
		return false;
	}

}
