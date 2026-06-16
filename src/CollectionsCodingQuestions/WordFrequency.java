package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	static void wordFr(String str)
	{
		String [] words = str.split(" ");

		Map<String,Integer> map = new HashMap<>();

		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}

		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey() +" -> " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		String str = "java java selenium java api";
		wordFr(str);
	}

}
