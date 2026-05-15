package Strings;

public class LargestDigitInString {

	static int largestDigit(String str)
	{
		int largest = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				if((ch-'0')>largest)
				{
					largest = ch-'0';
				}
			}
		}
		return largest;
	}

	public static void main(String[] args) {

		String str = "a9b2c7d4";
		System.out.println(largestDigit(str));

	}

}
