package CollectionsCodingQuestions;

import java.util.Map;
import java.util.TreeMap;

public class CountFrequencyAndSortByChar {

	static void sortByKeys(String str)
	{
		Map<Character,Integer> map = new TreeMap<>();

		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		for(Map.Entry<Character, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey() +" = " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		String str = "banana";
		sortByKeys(str);
	}

}
