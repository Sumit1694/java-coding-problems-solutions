package Strings;

public class RemoveCosecutiveDuplicates {

	public static void main(String[] args) {

		String str = "aaabbccaaa";
		String result = "";

		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i-1)!=str.charAt(i))
			{
				result += str.charAt(i-1);
			}
		}

		result += str.charAt(str.length()-1);

		System.out.println(result );

	}

}
