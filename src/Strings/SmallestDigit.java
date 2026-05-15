package Strings;

public class SmallestDigit {

	static int SmallestDigitinString(String str)
	{
		int smallest = Integer.MAX_VALUE;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				if((ch-'0')<smallest)
				{
					smallest = ch - '0';
				}
			}
		}
		return smallest;
	}

	public static void main(String[] args) {

		String str = "a9b2c7d4";
		System.out.println(SmallestDigitinString(str));

	}

}
