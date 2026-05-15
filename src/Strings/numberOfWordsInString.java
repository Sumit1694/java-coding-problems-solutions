package Strings;

public class numberOfWordsInString {

	static int numberOfWords(String str)
	{
		String [] words = str.split(" ");
		return words.length;
	}

	static int NumberOfWords(String str)
	{
		int count = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(ch==' ')
			{
				count++;
			}
		}
		return count + 1;
	}

	public static void main(String[] args) {

		String str = "my name is sumit";
		System.out.println(numberOfWords(str));
		System.out.println(NumberOfWords(str));

	}
}