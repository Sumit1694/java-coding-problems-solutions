package Strings;

public class DuplicateCharactersFromString {

	public static void main(String[] args) {

		String str = "automation";

		for(int i=0;i<str.length();i++)
		{
			boolean alreadyPrinted = false;

			for(int k=0;k<i;k++)
			{
				if(str.charAt(i)==str.charAt(k))
				{
					alreadyPrinted = true;
					break;
				}
			}

			if(alreadyPrinted)
			{
				continue;
			}

			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) && i!=j)
				{
					System.out.println(str.charAt(i));
				}
			}
		}

	}

}
