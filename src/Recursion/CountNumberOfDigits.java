package Recursion;

public class CountNumberOfDigits {

	static long noOfDigits(long n)
	{
		if(n==0)
		{
			return 0;
		}

		return noOfDigits(n/10) + 1;
	}

	public static void main(String[] args) {

		long n = 12345;
		System.out.println(noOfDigits(n));

	}

}
