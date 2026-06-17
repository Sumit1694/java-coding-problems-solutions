package Strings;

import java.util.HashMap;
import java.util.Map;

public class StringsAreIsoMorphic {

	static boolean isIsomorphic(String str1, String str2)
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

	public static void main(String[] args) {

		String str1 = "egg";
		String str2 = "add";
        System.out.println(isIsomorphic(str1, str2));
	}

}
