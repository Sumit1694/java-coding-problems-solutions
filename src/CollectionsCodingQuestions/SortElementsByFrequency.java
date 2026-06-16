package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortElementsByFrequency {

	static void SortByFreq(int [] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();

		for(int i:arr)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}

		List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, (e1,e2) -> e2.getValue().compareTo(e1.getValue()));

		for(Map.Entry<Integer, Integer>entry:list)
		{
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,1,1,2,2,3};
		SortByFreq(arr);
	}
}