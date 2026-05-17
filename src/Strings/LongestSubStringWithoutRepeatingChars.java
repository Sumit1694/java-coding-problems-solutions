package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {

	static String longest(String str)
	{
		String longest = "";

		for(int i=0;i<str.length();i++)
		{
			Set<Character>set = new HashSet<>();
            String curr = "";

            for(int j=i;j<str.length();j++)
            {
            	if(set.contains(str.charAt(j)))
            	{
            		break;
            	}
            	curr += str.charAt(j);
            	set.add(str.charAt(j));
            }

            if(curr.length()>longest.length())
            {
            	longest = curr;
            }
		}

		return longest;
	}

	static int lengthOfLongestSubstring(String str)
	{
		Set<Character>set = new HashSet<>();
		int maxLength = 0;
		int left = 0;

		for(int right=0;right<str.length();right++)
		{
			while(set.contains(str.charAt(right)))
			{
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(right));
			maxLength = Math.max(maxLength, right-left+1);
		}

		return maxLength;
	}

	public static void main(String[] args) {

		String str = "abcabcbb";
		System.out.println(longest(str));
		System.out.println(lengthOfLongestSubstring(str));
	}
}
