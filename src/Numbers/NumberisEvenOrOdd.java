package Numbers;

public class NumberisEvenOrOdd {

	static boolean EvenOrOdd(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	static boolean EvenOrOddBitWise(int n)
	{
		if((n&1)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {

		int num = -18;
		System.out.println(EvenOrOddBitWise(num));

	}

}
