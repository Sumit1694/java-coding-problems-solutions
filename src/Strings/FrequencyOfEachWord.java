package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfEachWord {

	public static void main(String[] args) {

		String str = "Java is great and java is powerful".toLowerCase();
        String [] words = str.split(" ");

		Map<String,Integer> map = new LinkedHashMap<>();

		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}

		List<Map.Entry<String,Integer>>list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (e1,e2) -> e2.getValue().compareTo(e1.getValue()));

        for(Map.Entry<String, Integer>entry:list)
        {
        	System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
	}
}