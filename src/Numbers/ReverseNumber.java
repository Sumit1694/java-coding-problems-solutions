package Numbers;

public class ReverseNumber {

	static int reverse(int n)
	{
		int res = 0;

		while(n>0)
		{
			res = res * 10 + n % 10;
			n = n / 10;
		}
		return res;
	}

	public static void main(String[] args) {

		int num = 1234;
		System.out.println(reverse(num));

	}

}
