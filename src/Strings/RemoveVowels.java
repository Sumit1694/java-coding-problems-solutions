package Strings;

public class RemoveVowels {

	static String removeVowels(String str)
	{
		StringBuilder res = new StringBuilder();

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(!isVowel(ch))
			{
				res.append(ch);
			}
		}

		return res.toString();
	}

	static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}

	public static void main(String[] args) {

		String str = "software";
		System.out.println(removeVowels(str));

	}

}
