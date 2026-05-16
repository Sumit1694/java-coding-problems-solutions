package Strings;

public class MakeFirstCharCaps {

	static String FirstCharCaps(String str)
	{
		StringBuilder sb = new StringBuilder();
		String [] words = str.split(" ");

		for(String word:words)
		{
			sb.append(word.substring(0, 1).toUpperCase() + word.substring(1) +" ");
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		String str = "how are you";
		System.out.println(FirstCharCaps(str));

	}

}
