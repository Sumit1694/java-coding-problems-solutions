package Strings;

public class FindLongestWord {

	static String longestWord(String str)
	{
		String [] words = str.split(" ");
		String longest = "";

		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>longest.length())
			{
				longest = words[i];
			}
		}

		return longest;
	}

	public static void main(String[] args) {

		String str = "i love automation testing";
		System.out.println(longestWord(str));
	}

}
