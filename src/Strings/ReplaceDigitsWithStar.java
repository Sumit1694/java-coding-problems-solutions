package Strings;

public class ReplaceDigitsWithStar {

	static String replaceDigit(String str)
	{
		String replaced = "";

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				replaced += "*";
			}
			else
			{
				replaced += ch;
			}
		}
		return replaced;
	}

	public static void main(String[] args) {

		String str = "a1b2c3";
		System.out.println(replaceDigit(str));

	}

}
