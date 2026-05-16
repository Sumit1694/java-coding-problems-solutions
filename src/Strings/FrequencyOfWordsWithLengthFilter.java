package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfWordsWithLengthFilter {

	public static void main(String[] args) {

		String str = "selenium java automation testing java selenium framework";
		String [] words = str.split(" ");

		Map<String,Integer> map = new LinkedHashMap<>();

		for(String word:words)
		{
			if(word.length()>4)
			{
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}

		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey() +" -> " + entry.getValue());
		}
	}
}