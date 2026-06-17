package Strings;

public class ToggleCase {

	static String toggle(String str)
	{
		String result = "";

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(ch>='A' && ch<='Z')
			{
				result += (char)(ch+32);
			}
			else if(ch>='a' && ch<='z')
			{
				result += (char)(ch-32);
			}
		}
		return result;
	}

	static String toggle1(String str)
	{
		String result = "";

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isUpperCase(ch))
			{
				result += Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				result += Character.toUpperCase(ch);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		String str = "JaVa";
		System.out.println(toggle(str));
		System.out.println(toggle1(str));
	}

}
