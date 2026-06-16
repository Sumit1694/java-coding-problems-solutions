package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroupElementsByFreq {

	static void grouping(int [] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();

		for(int i:arr)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}

		for(Map.Entry<Integer, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

	static void grouping1(int [] arr)
	{
		Map<Integer,Integer> map = new TreeMap<>();

		for(int i:arr)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}

		for(Map.Entry<Integer, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,1,1,2,2,3};
		grouping(arr);
		grouping1(arr);
	}
}