package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {

	static String mostFreq(String str)
	{
		Map<String,Integer> map = new HashMap<>();

		String [] words = str.split(" ");

		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}

		int freq = 0;
		String word = "";

		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>freq)
			{
				freq = entry.getValue();
				word = entry.getKey();
			}
		}

		return word;
	}

	public static void main(String[] args) {

		String str = "java api java selenium java api";
        System.out.println(mostFreq(str));
	}
}