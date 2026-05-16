package Strings;

public class ReverseIOnlyLettersSepeatedByNumbers {

	public static void main(String[] args) {

		String str = "abc123xyz456pqr";
		System.out.println(reverseGroups(str));
	}

	static String reverseGroups(String str)
	{
		StringBuilder sb = new StringBuilder();

		int i =0;

		while(i<str.length())
		{
			String temp = "";

			while(i<str.length() && Character.isLetter(str.charAt(i)))
			{
				temp = str.charAt(i) + temp;
				i++;
			}

			sb.append(temp);

			while(i<str.length() && Character.isDigit(str.charAt(i)))
			{
				sb.append(str.charAt(i));
				i++;
			}
		}

		return sb.toString();
	}

}
