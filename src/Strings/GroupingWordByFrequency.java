package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingWordByFrequency {

	public static void main(String[] args) {

		String str = "test java test api java code api api";
		String [] words = str.split(" ");

		Map<String,Integer> freqMap = new HashMap<>();

		for(String word:words)
		{
			freqMap.put(word, freqMap.getOrDefault(word, 0)+1);
		}

		Map<Integer,List<String>>groupMap = new HashMap<>();

		for(Map.Entry<String, Integer>entry:freqMap.entrySet())
		{
			String word = entry.getKey();
			int freq = entry.getValue();

			groupMap.putIfAbsent(freq, new ArrayList<>());
			groupMap.get(freq).add(word);
		}

		for(List<String> list:groupMap.values())
		{
			Collections.sort(list);
		}

		List<Integer> li = new ArrayList<>(groupMap.keySet());
		Collections.sort(li);

		for(Integer freq:li)
		{
			System.out.println(freq + " -> " +groupMap.get(freq) );
		}
	}
}