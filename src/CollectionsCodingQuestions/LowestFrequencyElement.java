package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class LowestFrequencyElement {

	static int lowestFr(int [] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();

		for(int n:arr)
		{
			map.put(n, map.getOrDefault(n, 0)+1);
		}

		int freq = Integer.MAX_VALUE;
		int ele = 0;

		for(Map.Entry<Integer, Integer>entry:map.entrySet())
		{
			if(entry.getValue()<freq)
			{
				freq = entry.getValue();
				ele = entry.getKey();
			}
		}

		return ele;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,2,3,3,3};
        System.out.println(lowestFr(arr));
	}
}
