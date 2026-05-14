package Recursion;

public class RecursionSumOfAllDigits {

	static int sum(int n)
	{
		if(n<1)
		{
			return 0;
		}

		return sum(n/10) + n%10;
	}

	public static void main(String[] args) {

		int n = 1234;
        System.out.println(sum(n));
	}

}
