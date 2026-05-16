package Numbers;

public class PallindromeNumber {

	static boolean isPallindrome(int n)
	{
		int original = n;
		int rev = 0;

		while(n>0)
		{
			rev = rev * 10 + n % 10;
			n = n / 10;
		}

		if(rev==original)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int n = 121;
		System.out.println(isPallindrome(n));
	}
}