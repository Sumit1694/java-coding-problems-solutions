package Strings;

public class LongestRepeatingSubstring {

	static String longestSubstring(String str)
	{
	   String longest = "";

	   for(int i=0;i<str.length();i++)
	   {
		   for(int j=i;j<str.length();j++)
		   {
			   String sub = str.substring(i, j+1);

			   if(str.indexOf(sub)!=str.lastIndexOf(sub))
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

	public static void main(String[] args) {

		String str = "banana";
		System.out.println(longestSubstring(str));

	}

}
