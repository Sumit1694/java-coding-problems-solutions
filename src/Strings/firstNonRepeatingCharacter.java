package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingCharacter {

	static void firstNonRepeatedChar(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			boolean unique = true;

			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					unique = false;
					break;
				}
			}

			if(unique)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

	static void firstNonRepeatedCharUsingMap(String str)
	{
		Map<Character,Integer>map = new LinkedHashMap<>();

		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}

		for(Map.Entry<Character, Integer>entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}
	}

	public static void main(String[] args) {

		String str = "AABCDBECF";
		//firstNonRepeatedChar(str);
		firstNonRepeatedCharUsingMap(str);
	}
}