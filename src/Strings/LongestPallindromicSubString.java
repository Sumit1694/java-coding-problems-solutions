package Strings;

public class LongestPallindromicSubString {

	static int longestPallindromicSubstringLength(String str)
	{
		int longest = 0;

		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
                String sub = str.substring(i, j+1);

                if(isPallindrome(sub))
                {
                	longest = Math.max(longest, sub.length());
                }
			}
		}
		return longest;
	}

	static String longestPallindromicSubstring(String str)
	{
		String longest = "";

		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
                String sub = str.substring(i, j+1);

                if(isPallindrome(sub))
                {
                	if(sub.length()>longest.length())
                	{
                		longest = sub;
                	}
                }
			}
		}
		return longest;
	}

	static boolean isPallindrome(String str)
	{
		int l=0, h=str.length()-1;

		while(l<h)
		{
			if(str.charAt(l)!=str.charAt(h))
			{
				return false;
			}
			l++;
			h--;
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "baabccbf";
		System.out.println(longestPallindromicSubstring(str));
        System.out.println(longestPallindromicSubstringLength(str));
	}
}