package Strings;

public class ReverseOfWords {

	static String reverseWords(String str)
	{
		String [] words = str.split(" ");
		StringBuilder res = new StringBuilder();

		for(String word:words)
		{
			for(int i=word.length()-1;i>=0;i--)
			{
				res.append(word.charAt(i));
			}
			res.append(" ");
		}
		return res.toString();
	}

	public static void main(String[] args) {

		String str = "My name is sumit";
		System.out.println(reverseWords(str));

	}

}
