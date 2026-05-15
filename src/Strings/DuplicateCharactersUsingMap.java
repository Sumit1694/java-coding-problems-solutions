package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersUsingMap {

	static void duplicateCharacters(String str)
	{
		Map<Character,Integer> map = new HashMap<>();

		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {

		String str = "automation";
		duplicateCharacters(str);
	}
}