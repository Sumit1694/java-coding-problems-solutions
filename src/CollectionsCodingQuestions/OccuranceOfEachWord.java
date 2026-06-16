package CollectionsCodingQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfEachWord {

	static void Occurance(String str)
	{
		String [] words = str.split(" ");

		Map<String,Integer> map = new LinkedHashMap<>();

		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}

		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey() +" = " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		String str = "java is java and selenium is java";
		Occurance(str);
	}

}
