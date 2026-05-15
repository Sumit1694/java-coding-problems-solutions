package Strings;

public class PrintDigitsPresentInString {

	static void printDigits(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				System.out.print(ch +" ");
			}
		}
	}

	static void printDigits1(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(ch>='0' && ch<='9')
			{
				System.out.print(ch +" ");
			}
		}
	}

	public static void main(String[] args) {

		String str = "ab12cd34";
		printDigits(str);
		System.out.println();
		printDigits1(str);

	}
}