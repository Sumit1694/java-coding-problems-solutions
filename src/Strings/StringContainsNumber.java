package Strings;

public class StringContainsNumber {

	static boolean containsNumber(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String str1 = "hello123";
		String str2 = "hello";
		System.out.println(containsNumber(str1));
        System.out.println(containsNumber(str2));
	}

}
