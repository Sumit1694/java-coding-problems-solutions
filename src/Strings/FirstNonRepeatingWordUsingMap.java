package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingWordUsingMap {

	public static void main(String[] args) {

		String str = "test automation test framework automation java";
        String [] words = str.split(" ");

		Map<String,Integer> map = new LinkedHashMap<>();

		for(String word:words)
		{
            map.put(word, map.getOrDefault(word, 0)+1);
		}

		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}