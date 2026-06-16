package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class CharacterWithHighestFrequency {

	static Character highestFrChar(String str)
	{
		Map<Character,Integer> map = new HashMap<>();

		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		int freq = 0;
		char c = '\0';

		for(Map.Entry<Character, Integer>entry:map.entrySet())
		{
			if(entry.getValue()>freq)
			{
				freq = entry.getValue();
				c = entry.getKey();
			}
		}
		return c;
	}

	public static void main(String[] args) {

		String str = "banana";
		System.out.println(highestFrChar(str));
	}
}
