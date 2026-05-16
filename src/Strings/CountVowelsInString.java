package Strings;

public class CountVowelsInString {

	static int countVowels(String str)
	{
		int count = 0;

		for(char c:str.toCharArray())
		{
			if(isVowel(c))
			{
				count++;
			}
		}
		return count;
	}

	static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}

	public static void main(String[] args) {

		String str = "Software Testing";
		System.out.println(countVowels(str));
	}
}