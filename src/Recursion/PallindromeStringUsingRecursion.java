package Recursion;

public class PallindromeStringUsingRecursion {

	static boolean isPallindrome(String str, int i, int j)
	{
		if(str.charAt(i)!=str.charAt(j))
		{
			return false;
		}

		if(j<=i)
		{
			return true;
		}

		return isPallindrome(str, i+1, j-1);
	}

	public static void main(String[] args) {

		String str = "madam";
		System.out.println(isPallindrome(str, 0, str.length()-1));
	}
}