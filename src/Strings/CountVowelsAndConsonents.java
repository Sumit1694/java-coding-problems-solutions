package Strings;

public class CountVowelsAndConsonents {

	static void count(String str)
	{
		int vowelsCount = 0;
		int ConsonentsCount = 0;

		for(char ch:str.toCharArray())
		{
			if(Character.isAlphabetic(ch))
			{
				if(isVowel(ch))
				{
					vowelsCount++;
				}
				else
				{
					ConsonentsCount++;
				}
			}
		}

		System.out.println("Vowels Count: " + vowelsCount +" Consonents Count: " + ConsonentsCount);
	}

	static boolean isVowel(char ch)
	{
		return "AEIOUaeiou".indexOf(ch)!=-1;
	}

	public static void main(String[] args) {

		String str = "Java123";
		count(str);
	}
}