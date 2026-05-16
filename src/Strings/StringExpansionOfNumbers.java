package Strings;

public class StringExpansionOfNumbers {

	static String expand(String str)
	{
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isAlphabetic(ch))
			{
				int count = Character.getNumericValue(str.charAt(i+1));

				for(int j=0;j<count;j++)
				{
		            sb.append(ch);
				}
			}
		}
		return sb.toString();
	}

	static String expansion(String str)
	{
		char [] arr = str.toCharArray();

		StringBuilder sb = new StringBuilder();

		for(int i=0;i<arr.length;i+=2)
		{
			int count = arr[i+1] - '0';

			while(count>0)
			{
				sb.append(arr[i]);
				count--;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		String str = "a2b3c4";
		System.out.println(expand(str));
		System.out.println(expansion(str));

	}

}
