package Strings;

public class IfSubstringExists {

	static boolean isSubstringExists(String str, String sub)
	{
		return str.contains(sub);
	}

	static boolean isSubstringExists1(String str, String sub)
	{
		int i=0, j=0;
		int start = 0;

		while(i<str.length())
		{
			if(str.charAt(i)==sub.charAt(j))
			{
				i++;
				j++;

				if(j==sub.length())
				{
					return true;
				}
			}
			else
			{
				start++;
				i=start;
				j=0;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String str = "ababc";
		String sub = "abc";

		System.out.println(isSubstringExists(str, sub));
		System.out.println(isSubstringExists1(str, sub));
	}

}
