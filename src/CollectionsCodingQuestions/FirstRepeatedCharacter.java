package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedCharacter {

	static Character firstRepeated(String str)
	{
		Map<Character, Integer> map = new HashMap<>();

		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		for(Map.Entry<Character, Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				return entry.getKey();
			}
		}

		return '\0';
	}

	static Character firstRepeatedUsingSet(String str)
	{
		Set<Character> set = new HashSet<>();

		for(char ch:str.toCharArray())
		{
			if(!set.add(ch))
			{
				return ch;
			}
		}

		return '\0';
	}

	public static void main(String[] args) {

		String str = "automation";
		System.out.println(firstRepeated(str));
		System.out.println(firstRepeatedUsingSet(str));
	}

}
