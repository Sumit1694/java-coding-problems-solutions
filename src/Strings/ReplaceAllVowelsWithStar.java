package Strings;

public class ReplaceAllVowelsWithStar {

	static String replaceVowels(String str)
	{
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for(char ch:str.toCharArray())
		{
			if(isVowel(ch))
			{
				sb.append('*');
			}
			else
			{
				sb.append(ch);
			}
		}

		return sb.toString();
	}

	static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}

	public static void main(String[] args) {

		String str = "Welcome to india";
		System.out.println(replaceVowels(str));

	}

}
