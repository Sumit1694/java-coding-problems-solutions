package Strings;

public class CountDigitsInString {

	static int countDigits(String str)
	{
		int count = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				count++;
			}
		}
		return count;
	}

	static int countDigits2(String str)
	{
		int count = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(ch>='0' && ch<='9')
			{
				count++;
			}
		}
		return count;
	}

	static int countDigits3(String str)
	{
		int i=0, count=0;

		while(i<str.length())
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				count++;
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) {

		String str = "a1b2c3";
		System.out.println(countDigits(str));
		System.out.println(countDigits2(str));
		System.out.println(countDigits(str));
	}
}