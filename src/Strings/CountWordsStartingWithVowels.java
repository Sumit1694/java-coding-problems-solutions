package Strings;

public class CountWordsStartingWithVowels {

	static int countWords(String str)
	{
		String [] words = str.split(" ");
		int count = 0;

		for(String word:words)
		{
			char firstChar = word.charAt(0);

			if(isVowel(firstChar))
			{
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		String str = "I am an automation tester";
		System.out.println(countWords(str));

	}

	static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}

}
