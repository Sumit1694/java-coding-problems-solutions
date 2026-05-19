package Strings;

public class StringExpansion {

	public static void main(String[] args) {

		String str = "a2b3c4";

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isAlphabetic(ch))
			{
				int count = Character.getNumericValue(str.charAt(i+1));

				for(int j=0;j<count;j++)
				{
					System.out.print(ch);
				}
			}

		}

	}

}
