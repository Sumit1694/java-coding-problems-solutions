package Strings;

public class CountWords {

	static int countWords(String str)
	{
		String [] words = str.split(" ");

		return words.length;
	}

	static int countWords1(String str)
	{
		int count = 1;

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}

		return count;
	}


	public static void main(String[] args) {

		String str = "i love java coding";
		System.out.println(countWords(str));
		System.out.println(countWords(str));
	}

}
