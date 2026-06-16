package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class AllDuplicateChars {

	static void duplicates(String str)
	{
		Map<Character,Integer> map = new HashMap<>();

		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		for(Map.Entry<Character, Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.print(entry.getKey()+ " ");
			}
		}
	}

	public static void main(String[] args) {

		String str = "programming";
		duplicates(str);
	}

}
