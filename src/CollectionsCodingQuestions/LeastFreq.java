package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class LeastFreq {

	static String leastFreq(String str)
	{
		String [] words = str.split(" ");

		Map<String,Integer> map = new HashMap<>();

		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}

		String mostFreq = "";
		int freq = Integer.MAX_VALUE;

		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			if(entry.getValue()<freq)
			{
				freq = entry.getValue();
				mostFreq = entry.getKey();
			}
		}

		return mostFreq;
	}

	public static void main(String[] args) {

		String str = "java api java selenium api java test";
		System.out.println(leastFreq(str));
	}

}
