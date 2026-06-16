package Strings;
import java.util.*;

public class IsomorphicStrings
{
	static Boolean isIsomorphic(String str1, String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}

		Map<Character,Character> map = new HashMap<>();

		for(int i=0;i<str1.length();i++)
		{
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);

			if(!map.containsKey(c1))
			{
				if(map.containsValue(c2))
				{
					return false;
				}
				map.put(c1, c2);
			}
			else
			{
				if(map.get(c1)!=c2)
                {
                    return false;
                }
			}
		}
		return true;
	}
	public static void main(String [] args)
	{
		System.out.println(isIsomorphic("egg", "add"));   // true
		System.out.println(isIsomorphic("foo", "bar"));   // false
		System.out.println(isIsomorphic("paper", "title")); // true

	}
}