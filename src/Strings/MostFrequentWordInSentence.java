package Strings;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWordInSentence {

	static String mostFreqWord(String str)
	{
		String[] words = str.split(" ");

		Map<String,Integer> map = new HashMap<>();

		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}

		int freq = 0;
		String w = "";

		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			if(entry.getValue()>freq)
			{
				freq = entry.getValue();
				w = entry.getKey();
			}
		}

		return w;
	}

	public static void main(String[] args) {

		String str = "java python java selenium python java";
		System.out.println(mostFreqWord(str));
	}
}