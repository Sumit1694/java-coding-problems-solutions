package Strings;

import java.util.HashMap;
import java.util.Map;

/*Input - automation
output -a=2,u=1,t=2 etc.
In the same coding we have to remove vowels and get the count of non vowels count.
after that we have to keep only vowels and remove non vowels characters
 */

public class StringOperation2 {

	public static void main(String[] args) {

		String str = "automation";
        int nonVowelsCount = 0;
        String vowelsOnly = "";

		Map<Character,Integer> map = new HashMap<>();

		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);

			if(isVowel(ch))
			{
				vowelsOnly += ch +" ";
			}
			else
			{
				nonVowelsCount++;
			}
		}

		System.out.println("Only vowels: " + vowelsOnly);
		System.out.println("Non vowels count: " + nonVowelsCount);

		for(Map.Entry<Character, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey() +" -> " + entry.getValue());
		}
	}

	static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}

}
