package Strings;

public class SumOfAllDigits {

	static int sum(String str)
	{
		int sum = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				sum += ch - '0';
			}
		}
		return sum;
	}

	static int sum1(String str)
	{
		int sum = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(ch>='0' && ch<='9')
			{
				sum += ch - '0';
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		String str = "a1b2c3";
		System.out.println(sum(str));
		System.out.println(sum1(str));
	}
}