package Strings;

public class StringContainsVowels {

	static boolean containsVowel(String str)
	{
		for(char ch:str.toLowerCase().toCharArray())
		{
			if("aeiou".indexOf(ch)!=-1)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String str1 = "rhythm";
		String str2 = "apple";
		System.out.println(containsVowel(str1));
		System.out.println(containsVowel(str2));

	}

}
