package Numbers;

public class FactorialUsingLoop {

	static int factorial(int n)
	{
		int res = 1;

		for(int i=1;i<=n;i++)
		{
			res *= i;
		}
		return res;
	}

	static int factorial2(int n)
	{
		int res = 1;

		while(n>1)
		{
			res *= n;
			n--;
		}
		return res;
	}

	public static void main(String[] args) {

		int num = 5;
		System.out.println(factorial(num));
		System.out.println(factorial2(num));
	}

}
