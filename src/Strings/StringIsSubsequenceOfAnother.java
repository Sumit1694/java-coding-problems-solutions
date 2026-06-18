package Strings;

public class StringIsSubsequenceOfAnother {

	static boolean isSubsequence(String str1, String str2)
	{
		int i=0,j=0;

		while(i<str1.length() && j<str2.length())
		{
			if(str1.charAt(i)==str2.charAt(j))
			{
				i++;
			}
			j++;
		}
		return i==str1.length();
	}

		public static void main(String[] args) {

			String str1 = "abc";
			String str2 = "ahbgdc";
			System.out.println(isSubsequence(str1, str2));

		}

	}
