package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class countFr {

	static void CountFrequency(List<Integer> list)
	{
		Map<Integer,Integer> map = new HashMap<>();

		for(int n:list)
		{
			map.put(n, map.getOrDefault(n, 0)+1);
		}

		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,3,3));

		CountFrequency(list);
	}
}