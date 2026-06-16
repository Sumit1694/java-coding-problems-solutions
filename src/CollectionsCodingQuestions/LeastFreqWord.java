package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class LeastFreqWord {

	static String leastFreq(String str)
	{
		Map<String,Integer> map = new HashMap<>();

		String [] words = str.split(" ");

		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}

		int freq = Integer.MAX_VALUE;
		String word = "";

		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()<freq)
			{
				freq = entry.getValue();
				word = entry.getKey();
			}
		}

		return word;
	}

	public static void main(String[] args) {

		String str = "java api java selenium java api test";
        System.out.println(leastFreq(str));
	}

}
